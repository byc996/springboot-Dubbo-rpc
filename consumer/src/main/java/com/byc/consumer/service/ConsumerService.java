package com.byc.consumer.service;

import com.byc.provider.service.NameService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @DubboReference
    private NameService nameService;

    public String getName(String name) {
        return nameService.getName(name);
    }
}
