package com.springcloud.dubbo.consumer.vo;

import com.springcloud.dubbo.dubboapi.dto.OrderDto;
import lombok.Data;

import java.util.List;

@Data
public class UserVo {
    private Integer uid;
    private String username;
    private List<OrderDto> orders;
}
