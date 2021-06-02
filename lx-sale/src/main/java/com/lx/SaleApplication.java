package com.lx;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * luxing
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients({"com.lx"})
@MapperScan({"com.lx.**.mapper"})
@EnableKnife4j
@EnableSwagger2
public class SaleApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(SaleApplication.class, args);
    }
}
