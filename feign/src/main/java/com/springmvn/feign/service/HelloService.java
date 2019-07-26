package com.springmvn.feign.service;

import com.springmvn.feign.rpc.GetHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    @Autowired
    private GetHello getHello;

    public String sayHello(){
        return getHello.sayHello();
    }
}
