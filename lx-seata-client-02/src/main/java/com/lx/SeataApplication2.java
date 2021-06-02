package com.lx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * lx
 *
 */
@SpringBootApplication
//@EnableDiscoveryClient
//@EnableFeignClients({"com.lx"})
@MapperScan({"com.lx.**.mapper"})
//@EnableKnife4j
//@EnableSwagger2
public class SeataApplication2
{
    public static void main( String[] args )
    {
        SpringApplication.run(SeataApplication2.class, args);
    }
}