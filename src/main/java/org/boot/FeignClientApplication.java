package org.boot;

import org.boot.dto.DistributorDto;
import org.boot.service.DistributorService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableFeignClients
public class FeignClientApplication {

    public static void main(String[] args) {
        ApplicationContext context =SpringApplication.run(FeignClientApplication.class, args);
        DistributorService service = context.getBean(DistributorService.class);
        DistributorDto dto = service.getDistributor("D001");
        System.out.println(dto);
    }

}
