package com.snowballtech.common.server.eureka.controller;

import com.snowballtech.common.server.eureka.util.JsonUtil;
import org.springframework.http.HttpRequest;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 余海
 * @version 1.0
 * @description: TODO
 * @date 2020/9/8 18:52
 * @email hai.yu@snowballtech.com
 */
@RestController
@RequestMapping("/")
public class IndexController {

    @PostMapping(value = "/unbindCard/{bizSerialNo}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String hello(@PathVariable(value="bizSerialNo") String bizSerialNo, HttpServletRequest request) {

        System.out.println(request.getHeader("x-snbps-session-id"));


        System.out.println("biz:"+bizSerialNo);
        return "{\"resp_code\":\"aaa\",\"resp_msg\":\""+bizSerialNo+"！\"}";
    }
}
