package com.example.demo.demos.repository;

import com.example.demo.demos.entity.LocationTerminalFibit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LocationTerminalFibitRepostory extends JpaRepository<LocationTerminalFibit,String> {

    List<LocationTerminalFibit> findByDeviceId(String deviceId);

}
