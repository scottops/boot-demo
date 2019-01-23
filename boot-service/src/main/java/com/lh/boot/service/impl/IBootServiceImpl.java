package com.lh.boot.service.impl;

import com.lh.boot.service.IBootService;
import org.springframework.stereotype.Service;


@Service
public class IBootServiceImpl implements IBootService {
    public void sayHello(String msg) throws Exception {
        System.out.println("say:"+msg);
    }
}
