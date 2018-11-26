package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class UserController {
    @Autowired
    private UserService us;

    @RequestMapping("/login")
    public String login(User user, Map map, HttpSession session, String number) {
        User user1 = us.login(user);
        System.out.println("验证码" + number);
        String sessionkaptcha = (String) session.getAttribute("kaptcha");
        if (user1 != null && sessionkaptcha.equalsIgnoreCase(number)) {
            map.put("user", user1);
            System.out.println("***测试登录的查询数据" + user1);
            return "redirect:main/main.jsp";
        } else {
            return "index";
        }
    }
}
