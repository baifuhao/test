package com.yh.controller;

import com.yh.pojo.bankCard;
import com.yh.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author lixuan
 */
@Controller
@RequestMapping("bfh")
public class TestController {

    @Autowired
    private TestService testService;


    @ResponseBody
    @RequestMapping("querybankCardinfo")
    public List<bankCard> querybankCardinfo(){




        return testService.querybankCardinfo();
    }
}
