package com.hp.controller;

import com.hp.pojo.User;
import com.hp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;
    //测试代码
    @RequestMapping("World")
    @ResponseBody
    public String sayHello(){
        System.out.println("haha");
        return  "success";
    }
    //根据ID查询，user_id=useId
    @GetMapping("/{userid}")
    @ResponseBody
    public User queryUserById(@PathVariable("userid") Long id){
        User user=userService.queryUserById(id);
        return user;
    }
    //根据id删除数据
    @GetMapping("/del/{userid}")
    @ResponseBody
    public String deleteUserById(@PathVariable("userid") Long id){
        userService.deleteUserById(id);
        return "success";
    }
    @GetMapping("list")
    public String queryAll(Model model){
        List<User> listuser=userService.queryAll();
        model.addAttribute("users",listuser);
        return  "queryAll";
    }
}
