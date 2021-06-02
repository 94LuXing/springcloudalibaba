package com.lx.business.feign;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Component
public class StockFeignServiceFallback implements StockFeignService {

    @ResponseBody
    public String getByStockId(String id) {
        return "-1";
    }

}
