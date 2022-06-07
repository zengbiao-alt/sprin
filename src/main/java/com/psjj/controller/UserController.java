package com.psjj.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UserController {
    @GetMapping("/hello")
    public String hello()
    {
        log.error("出错了");
        log.info("正常信息打印");
        log.warn("警告信息");
        return "spring helloword4";
    }
}
