package com.yur.note.account.controller;

import com.yur.auth.service.UserService;
import com.yur.util.CommonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/account")
public class AccountController {



    @ResponseBody
    @RequestMapping("/hello/{id}")
    public String hello( @PathVariable(value = "id") String id){

        return "hello="+ id;
    }

}
