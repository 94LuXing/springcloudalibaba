package com.lx.business.mq;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RocketMQMessageListener(consumerGroup = "shop-user", topic = "order-topic")
public class TestRocketMQListener implements RocketMQListener<String> {

    @Override
    public void onMessage(String order) {
        log.info("收到一个消息", JSON.toJSONString(order));
    }

}
