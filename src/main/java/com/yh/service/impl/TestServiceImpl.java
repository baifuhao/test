package com.yh.service.impl;

import com.yh.dao.TestDao;
import com.yh.pojo.bankCard;
import com.yh.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lixuan
 */
@Service
public class TestServiceImpl  implements TestService{

    @Autowired
    private TestDao testDao;

    @Override
    public List<bankCard> querybankCardinfo() {

        return testDao.querybankCardinfo();
    }
}
