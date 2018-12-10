package com.soecode.lyf.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by 耿志飞 on 2018/12/4 0004.
 */
@Controller
public class BaseController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    private String index() {
        return "/login";
    }
}
