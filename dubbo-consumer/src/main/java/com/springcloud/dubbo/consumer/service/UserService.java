package com.springcloud.dubbo.consumer.service;

import com.springcloud.dubbo.consumer.vo.UserVo;

import java.util.List;

public interface UserService {
    List<UserVo> getUserOrders();
}
