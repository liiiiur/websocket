package com.example.demo.demos.service;

import com.example.demo.demos.entity.LocationTerminalRtlsHi;
import com.example.demo.demos.repository.LocationTerminalRtlsHiRepostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class LocationTerminalRtlsHiService {

    @Autowired
    private LocationTerminalRtlsHiRepostory repostory;

    @Transactional
    public void addData(LocationTerminalRtlsHi data){
        repostory.save(data);
    }

}
