package com.lh.bootweb.web.controller;

import com.lh.boot.entity.Foo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BootController {

    @RequestMapping("/test")
    public  Foo   hello(){
        Foo foo = new Foo();
        foo.setId(1000);
        foo.setText("abcd");
        return  foo;
    }

}
