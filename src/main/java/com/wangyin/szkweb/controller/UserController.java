package com.wangyin.szkweb.controller;

import com.wangyin.szkweb.Domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by shizhongkai on 2016/11/8.
 */

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/register")
    public String register() {
        return "user/register";
    }

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView createUser(User user) {
        ModelAndView mava = new ModelAndView();
        System.out.print(user.getUserName());
        mava.setViewName("user/createSuccess2");
        mava.addObject("user", user);
        return mava;
    }
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView createUser2(User user) {
        ModelAndView mava = new ModelAndView();
        System.out.print(user.getUserName());
        mava.setViewName("user/createSuccess2");
        mava.addObject("user", user);
        return mava;
    }

}
