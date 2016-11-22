package com.wangyin.umbrella_account_manager.controller;

import com.wangyin.umbrella_account_manager.Domain.User;
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
        mava.setViewName("user/createSuccess");
        mava.addObject("user", user);
        return mava;
    }

}
