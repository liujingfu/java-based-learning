package org.ljf.aopdemo.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * 1 * @Author: ljf
 * 2 *@version: v1.0
 * 3 *@description: org.ljf.aopdemo.controller
 * 4 * @Date: 2019/9/3 17:14
 * 5
 */
//@RestController
public class TestController {

    @GetMapping("/api/get")
    public String get() {
        return "Hello World!";
    }

    @PostMapping("/api/post")
    public String post() {
        return "POST process has finished.";
    }

    @GetMapping("/api/user")
    public Object get(HttpServletRequest req) {
        SecurityContextImpl sci = (SecurityContextImpl) req.getSession().getAttribute("SPRING_SECURITY_CONTEXT");
        if (sci != null) {
            Authentication authentication = sci.getAuthentication();
            if (authentication != null) {
                return authentication.getPrincipal();
            }
        }
        return "none";
    }
}
