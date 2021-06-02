package com.lx.business.feign;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
@ResponseBody
public class StockFeignServiceFallBackFactory implements FallbackFactory<StockFeignService> {

    public StockFeignService create(Throwable throwable) {
        return new StockFeignService() {
            public String getByStockId(String id) {
                return "2";
            }
        };
    }
}
