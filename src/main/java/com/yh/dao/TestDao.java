package com.yh.dao;

import com.yh.pojo.bankCard;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author lixuan
 */
@Mapper
public interface TestDao {


    List<bankCard> querybankCardinfo();
}
