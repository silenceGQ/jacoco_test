package com.jacoco.demotest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/test")
public class TestController {
    @GetMapping("/add")
    public String addTest(@RequestParam(name="a")int a, @RequestParam(name="b")int b){
        if(a<= 0|b <= 0){
            return "参数大于0";
        }else if (a>=100|b>=100){
            return "参数小于100";
        }else return String.valueOf((a+b));
    }

    @GetMapping("/multiplicate")
    public String multiplicateTest(@RequestParam(name="a")int a, @RequestParam(name="b")int b){
        if(a== 0|b == 0){
            return "结果是0";
        }else if (a>=100|b>=100){
            return "参数小于100";
        }else return String.valueOf((a*b));
    }

    @GetMapping("/subtract")
    public String subtractTest(@RequestParam(name="a")int a, @RequestParam(name="b")int b){
        if (a<b){
            return "a大于b";
        }
        if(a<= 0|b <= 0){
            return "参数大于0";
        }else if (a>=100|b>=100){
            return "参数小于100";
        }else return String.valueOf((a-b));
    }
}
