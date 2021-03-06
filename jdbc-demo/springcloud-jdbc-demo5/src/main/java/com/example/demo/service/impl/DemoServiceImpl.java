package com.example.demo.service.impl;

import com.example.demo.dao.TestDao;
import com.example.demo.entity.Test;
import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by lorne on 2017/6/26.
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private TestDao testDao;

    @Override
    public List<Test> list() {
        return testDao.list();
    }

    @Override
    @Transactional
    public int save() {

        int rs = testDao.save();

        return rs;
    }
}
