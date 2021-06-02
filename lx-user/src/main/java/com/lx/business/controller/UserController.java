package com.lx.business.controller;


import com.alibaba.fastjson.JSON;
import com.lx.business.entity.User;
import com.lx.business.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author luxing
 * @since 2021-05-23
 */
@SuppressWarnings("ALL")
@RestController
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/user/getById")
    public String getUserById(@RequestParam String id){
        User byId = userService.getById(id);
        return JSON.toJSONString(byId);
    }

    @GetMapping("/test")
    public String test(){
        //从nacos中获取服务地址
        ServiceInstance serviceInstance =
                discoveryClient.getInstances("lx-stock-server").get(0);
        String url = serviceInstance.getHost() + ":" +
                serviceInstance.getPort();
        log.info(">>从nacos中获取到的微服务地址为:" + url);
//通过restTemplate调用商品微服务
        String forObject = restTemplate.getForObject(
                "http://" + url + "/stock/getByStockId?id=05d6b89506d54bf586c07d0f89d66b6b", String.class);
        log.info(">>商品信息,查询结果:" + JSON.toJSONString(forObject));
        return "";
    }

}

