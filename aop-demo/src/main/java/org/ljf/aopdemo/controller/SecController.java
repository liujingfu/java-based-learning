package org.ljf.aopdemo.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * description
 *
 * @author ljf 2019/09/17 15:50
 */
@RestController
public class SecController {
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