package com.service;


import com.allinterface.OrderService;
import com.beans.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private OrderService orderService;

    public List<Address> getAddress(Integer uid)
    {
        return orderService.getAllAddressByUid(uid);
    }
}
