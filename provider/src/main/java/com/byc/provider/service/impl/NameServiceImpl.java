package com.byc.provider.service.impl;

import com.byc.provider.service.NameService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class NameServiceImpl implements NameService {
    @Override
    public String getName(String name) {
        return "name: " + name;
    }
}
