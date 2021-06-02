package com.lx.business.mq;

import com.lx.business.feign.StockFeignService;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.client.producer.SendStatus;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ContractController {

    @Autowired
    private StockFeignService stockFeignService;

    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    @GetMapping(value = "/feignTest")
    public String feignTest(@RequestParam String id){
        String byStockId = stockFeignService.getByStockId(id);
        rocketMQTemplate.convertAndSend("order-topic", byStockId);
        return byStockId;
    }

    @GetMapping(value = "/mqTest1")
    public String mqTest1(@RequestParam String id){
        String byStockId = stockFeignService.getByStockId(id);
        // 同步消息
        SendResult sendResult = rocketMQTemplate.syncSend("sale-topic", byStockId);
        SendStatus sendStatus = sendResult.getSendStatus();
        return sendStatus.toString();
    }



}
