package org.boot.service;

import org.boot.dto.DistributorDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "distributor-network")
public interface DistributorService {
    @GetMapping("/distributor/{distributorCode}")
    DistributorDto getDistributor(@PathVariable String distributorCode);
}
