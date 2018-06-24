package com.hjs.service;

import com.github.pagehelper.PageHelper;
import com.hjs.mapper.UserMapper;
import com.hjs.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: huangjianshuang
 * @Description:
 * @Date: Created in 9:58 2018-6-24
 * @Modified by:
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> findUsers(int pageNum,int pageSize){

        PageHelper.startPage(pageNum,pageSize);

        return userMapper.selectAll();

    }




}
