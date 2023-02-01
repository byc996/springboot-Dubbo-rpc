package com.byc.consumer;

import com.byc.consumer.service.ConsumerService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class ConsumerApplicationTests {

    @Resource
    ConsumerService consumerService;

    @Test
    void contextLoads() {
        System.out.println(consumerService.getName("test"));
    }

}
