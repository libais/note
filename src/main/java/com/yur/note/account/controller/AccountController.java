package com.yur.note.account.controller;

import com.yur.note.account.entity.User;
import com.yur.note.account.service.UserService;
import com.yur.util.CommonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController(value = "account")
public class AccountController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/{userId}")
    public Object getUserById(@PathVariable(value = "userId") Integer userId) {
        try {
            return new CommonResponse(true, userService.getUserById(userId));
        } catch (Exception e) {
            e.printStackTrace();
            return new CommonResponse(false, e.getMessage());
        }
    }
}
