package com.example.demo.demos.repository;

import com.example.demo.demos.entity.LocationTerminalRtl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface LocationTerminalRtlRepostory extends JpaRepository<LocationTerminalRtl,String> {

    @Query("select a from LocationTerminalRtl a where a.deviceId= :deviceId")
    LocationTerminalRtl getByDeviceId(@Param("deviceId") String deviceId);
}
