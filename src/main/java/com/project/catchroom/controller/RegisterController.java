package com.project.catchroom.controller;

import com.project.catchroom.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController {
    @Autowired
    private MemberService memberService;

    public RegisterController(MemberService memberService){
        this.memberService= memberService;
    }

    @GetMapping("login")
    public ModelAndView loginForm(){
        return new ModelAndView("/register/loginForm");
    }

}
