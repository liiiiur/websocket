package com.example.demo.demos.service;

import com.example.demo.demos.entity.LocationTerminalRtl;
import com.example.demo.demos.repository.LocationTerminalRtlRepostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

@Service
public class LocationTerminalRtlService {

    @Autowired
    private LocationTerminalRtlRepostory repostory;


    @Transactional
    public void addOrUpdate(LocationTerminalRtl data){
        LocationTerminalRtl result = repostory.getByDeviceId(data.getDeviceId());

        if(result!=null){
            result.setLon(data.getLon());
            result.setLat(data.getLat());
            repostory.save(result);
        }else {
            repostory.save(data);
        }
    }


}
