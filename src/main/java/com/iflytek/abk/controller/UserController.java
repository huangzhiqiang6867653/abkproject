package com.iflytek.abk.controller;

import com.iflytek.abk.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * @author huangzhiqiang
 * 用户管理-控制层
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Resource
    UserService userService;

    @RequestMapping(value="/get/{userNo}", method=RequestMethod.GET)
    public ModelAndView get(@PathVariable String userNo, Model model){
        ModelAndView mav = new ModelAndView("user");
        String username = userService.get(userNo);
        mav.addObject("username", username);
        mav.addObject("msg", "获取用户");
        return mav;
    }

    @RequestMapping(value="/update/{userNo}", method=RequestMethod.GET)
    public ModelAndView update(@PathVariable String userNo, Model model){
        ModelAndView mav = new ModelAndView("user");
        userService.update(userNo);
        mav.addObject("userNo", userNo);
        mav.addObject("msg", "更新");
        return mav;
    }

    @RequestMapping(value="/removeAll", method=RequestMethod.GET)
    public ModelAndView removeAll(){
        ModelAndView mav = new ModelAndView("user");
        mav.addObject("msg", "删除全部");
        userService.removeAll();
        return mav;
    }
}
