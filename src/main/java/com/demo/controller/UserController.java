package com.demo.controller;

import com.demo.model.User;
import com.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/* @
 * @ClassName UserController
 * @Description
 * @Author cy
 * @Date 2020-07-26 11:42
 * Version 1.0
 **/
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("select")
    public String selectUser(HttpServletRequest request, HttpServletResponse response) throws Exception {
        User user = userService.selectByPrimaryKey(1);
        request.setAttribute("user",user);
        return "user";
    }
}