package com.hjs.controller;

import com.hjs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: huangjianshuang
 * @Description:
 * @Date: Created in 10:05 2018-6-24
 * @Modified by:
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {


    @Autowired
    private UserService userService;


    @ResponseBody
    @RequestMapping(value = "/all/{pageNum}/{pageSize}", produces = {"application/json;charset=UTF-8"})
    public Object findAllUser(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){

        return userService.findUsers(pageNum,pageSize);
    }



}
