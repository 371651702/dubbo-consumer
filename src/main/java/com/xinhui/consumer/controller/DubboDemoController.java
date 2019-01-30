package com.xinhui.consumer.controller;

import com.xinhui.consumer.service.IDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dongliang.wang
 * @createTime 2019/1/21
 **/
@RestController
public class DubboDemoController {

    @Autowired(required = false)
    private IDemoService demoService;

    @RequestMapping("/save")
    public String test(){
        return demoService.test();
    }
}
