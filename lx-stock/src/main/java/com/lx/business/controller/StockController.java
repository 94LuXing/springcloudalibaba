package com.lx.business.controller;


import com.lx.business.entity.Stock;
import com.lx.business.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 销售库存表 前端控制器
 * </p>
 *
 * @author luxing
 * @since 2021-05-23
 */
@RestController
public class StockController {

    @Autowired
    private StockService stockService;

    @GetMapping(value = "/stock/getByStockId")
    public String getByStockId(@RequestParam String id){
        Stock byId = stockService.getById(id);
        return byId.toString();
    }

}

