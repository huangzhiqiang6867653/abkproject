package com.iflytek.abk.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author 黄智强
 * 功能：测试
 */
@Controller
public class MainController {
    @RequestMapping(value = {"/", "/index.html"})
    public ModelAndView Index(ModelMap model) {
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("message", "Hello World!");
        return mav;
    }

    @RequestMapping("login")
    public String Login(ModelMap model) {
        return "login";
    }

    @RequestMapping("adminRoles")
    public ModelAndView AdminRoles(ModelMap model) {
        ModelAndView mav = new ModelAndView("adminRoles");
        return mav;
    }

    @RequestMapping(value = "loginUser", method = RequestMethod.POST)
    public String LoginUser(String userName, String passwd, Model model) {
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(userName, passwd);
        try {
            subject.login(token);
            return "redirect:/index.html";
        } catch (UnknownAccountException e) {
            e.printStackTrace();
            model.addAttribute("message", "用户名错误！");
            return "login";
        } catch (IncorrectCredentialsException e) {
            e.printStackTrace();
            model.addAttribute("message", "密码错误");
            return "login";
        }
    }

    @RequiresPermissions("user:query")
    @RequestMapping(value = {"/testPermissions"})
    public ModelAndView TestPermissions(ModelMap model) {
        ModelAndView mav = new ModelAndView("testShiro");
        mav.addObject("message", "TestPermissions OK!");
        return mav;
    }

    @RequiresRoles("admin")
    @RequestMapping(value = {"/testRoles.html"})
    public ModelAndView TestRoles(ModelMap model) {
        ModelAndView mav = new ModelAndView("testShiro");
        mav.addObject("message", "TestRoles OK!");
        return mav;
    }
}
