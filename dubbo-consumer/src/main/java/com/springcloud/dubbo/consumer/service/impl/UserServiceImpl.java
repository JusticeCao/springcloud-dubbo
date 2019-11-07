package com.springcloud.dubbo.consumer.service.impl;

import com.springcloud.dubbo.consumer.service.UserService;
import com.springcloud.dubbo.consumer.vo.UserVo;
import com.springcloud.dubbo.dubboapi.OrderService;
import com.springcloud.dubbo.dubboapi.dto.OrderDto;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Reference
    OrderService orderService;

    @Override
    public List<UserVo> getUserOrders() {
        List<OrderDto> orders = orderService.getOrders();

        ArrayList<UserVo> userVos = new ArrayList<>();
        UserVo user = new UserVo();
        user.setUid(1);
        user.setUsername("test");

        user.setOrders(orders);

        userVos.add(user);

        return userVos;
    }
}
