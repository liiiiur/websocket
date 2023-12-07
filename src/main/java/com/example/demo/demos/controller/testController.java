package com.example.demo.demos.controller;

import com.example.demo.demos.entity.LocationTerminalFibit;
import com.example.demo.demos.entity.LocationTerminalRtl;
import com.example.demo.demos.entity.LocationTerminalRtlsHi;
import com.example.demo.demos.service.LocationTerminalFibitHisService;
import com.example.demo.demos.service.LocationTerminalRtlService;
import com.example.demo.demos.service.LocationTerminalRtlsHiService;
import com.example.demo.dto.LocationTerminalRtlDto;
import com.example.demo.dto.Map.EntityDTOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;

@RestController
public class testController {

    @Autowired
    private LocationTerminalFibitHisService service1;

    @Autowired
    private LocationTerminalRtlService service2;

    @Autowired
    private LocationTerminalRtlsHiService service3;

    @PostMapping("/locationTerminalFibit/save")
    public void addData(@RequestBody LocationTerminalFibit data){
        service1.add(data);
        System.out.println(data);
    }

    @PostMapping("/test2")
    public void addData2(@RequestBody LocationTerminalRtlDto dto){
        LocationTerminalRtl locationTerminalRtl = EntityDTOMapper.mapDTOToEntity(dto, LocationTerminalRtl.class);
        LocationTerminalRtlsHi locationTerminalRtlsHi = EntityDTOMapper.mapDTOToEntity(dto, LocationTerminalRtlsHi.class);
        service2.addOrUpdate(locationTerminalRtl);
        service3.addData(locationTerminalRtlsHi);
    }

}
