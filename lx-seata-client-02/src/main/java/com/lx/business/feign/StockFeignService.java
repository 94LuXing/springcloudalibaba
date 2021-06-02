//package com.lx.business.feign;
//
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//@FeignClient(value = "lx-stock-server")
//public interface StockFeignService {
//
//    @GetMapping(value = "/stock/getByStockId")
//    String getByStockId(@RequestParam("id") String id);
//
//}
