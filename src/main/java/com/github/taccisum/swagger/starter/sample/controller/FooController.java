package com.github.taccisum.swagger.starter.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tac - liaojf@cheegu.com
 * @since 2019/2/12
 */
@RequestMapping("foo")
@RestController
public class FooController {
    @GetMapping("bar")
    public String bar() {
        return "hello";
    }

    @GetMapping("/dev/bar")
    public String bar4Dev() {
        return "hello";
    }

    @GetMapping("/test")
    public String test() {
        return "test";
    }
}
