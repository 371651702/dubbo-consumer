package com.xinhui.consumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xinhui.dubbo.service.IDubboDemoService;
import org.springframework.stereotype.Service;

/**
 * @author dongliang.wang
 * @createTime 2019/1/22
 **/
@Service
public class DemoServiceImpl implements IDemoService {

    @Reference
    public IDubboDemoService dubboDemoService;

    @Override
    public String test() {
        return dubboDemoService.helloDubbo();
    }
}
