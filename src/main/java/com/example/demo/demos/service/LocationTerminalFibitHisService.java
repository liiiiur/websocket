package com.example.demo.demos.service;

import com.example.demo.demos.entity.LocationTerminalFibit;
import com.example.demo.demos.repository.LocationTerminalFibitRepostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationTerminalFibitHisService {

    @Autowired
    private LocationTerminalFibitRepostory repository;

    public void add(LocationTerminalFibit data){
        repository.save(data);
    }
}
