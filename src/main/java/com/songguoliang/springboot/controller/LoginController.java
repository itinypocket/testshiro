package com.songguoliang.springboot.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description
 * @Author sgl
 * @Date 2018-05-09 16:34
 */
@Controller
public class LoginController {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping("/")
    public String root() {
        return "redirect:/index";
    }

    @GetMapping("/login")
    public String login() {
        SecurityUtils.getSubject().logout();
        if (SecurityUtils.getSubject().isAuthenticated()) {
            return "redirect:/index";
        }
        return "login";
    }

    @PostMapping("/login")
    public String login(String loginName, String password, Model model) {
        Subject user = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(loginName, password);
        logger.info("用户[" + loginName + "]验证开始");
        try {
            user.login(token);
            logger.info("用户[" + loginName + "]验证通过");
            return "redirect:/index";
        } catch (AuthenticationException e) {
            logger.error(e.toString(), e);
            model.addAttribute("message", "用户名或密码不正确");
        }
        return "login";
    }

    @GetMapping("/unauth")
    public String unauth(){
        return "unauth";
    }

}
