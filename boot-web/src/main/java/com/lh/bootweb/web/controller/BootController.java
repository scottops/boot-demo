package com.lh.bootweb.web.controller;


import javax.sql.DataSource;
import com.lh.boot.entity.Foo;
import com.lh.boot.entity.TbPerson;
import com.lh.boot.service.IBootService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.util.List;

@RestController
@RequestMapping("/api")
public class BootController {

  //  @Autowired
    DataSource ds;

  @Autowired
    IBootService iBootService;


    @RequestMapping("/test")
    public  Object    hello() throws Exception {
        Foo foo = new Foo();
        foo.setId(1000);
        foo.setText("abcd");

      //  System.out.println(ds.getClass().getName());
        System.out.println(iBootService);
        List<TbPerson> data = iBootService.findAll();

        System.out.println(data);
        return  data;
    }

}
