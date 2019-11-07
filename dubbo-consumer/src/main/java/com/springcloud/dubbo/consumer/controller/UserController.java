package com.springcloud.dubbo.consumer.controller;

import com.springcloud.dubbo.consumer.service.UserService;
import com.springcloud.dubbo.consumer.vo.UserVo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/list")
    public List<UserVo> listOrders() {
        return userService.getUserOrders();
    }
}
