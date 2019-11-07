package com.springcloud.dubbo.dubboapi;

import com.springcloud.dubbo.dubboapi.dto.OrderDto;

import java.util.List;

/**
 *
 */
public interface OrderService {
    public List<OrderDto> getOrders();
}
