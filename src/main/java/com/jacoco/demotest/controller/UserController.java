package com.jacoco.demotest.controller;

import com.jacoco.demotest.bean.User;
import com.jacoco.demotest.dao.UserDao;
import com.jacoco.demotest.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.*;

@RestController
@RequestMapping(value="/users")     // 通过这里配置使下面的映射都在/users下
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("/test")
    public String test() {

        return "ok";
    }

    @GetMapping(path = "/byName/{userName}")
    public User getUserByName(@PathVariable("userName") String userName) {

        User r = userService.findUserByName(userName);
        return r;
    }

    //@RequestMapping(value="/", method=RequestMethod.POST)
    @PostMapping("/")
    public String postUser(@RequestBody User user) {
        // 处理"/users/"的POST请求，用来创建User
        // 除了@ModelAttribute绑定参数之外，还可以通过@RequestParam从页面中传递参数
        userService.addUser(user);
        return "success";
    }
}
