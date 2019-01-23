package com.lh.boot.service.impl;

import com.lh.boot.dao.TbPersonMapper;
import com.lh.boot.entity.TbPerson;
import com.lh.boot.service.IBootService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class IBootServiceImpl implements IBootService {

    @Autowired
    private TbPersonMapper mapper;

    public List<TbPerson> findAll() throws Exception {
        return   mapper.selectAll();
    }



}
