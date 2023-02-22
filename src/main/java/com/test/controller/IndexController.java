package com.test.controller;

/**
 * @ClassName: IndexController
 * @Description:
 * @Author: Administrator
 * @Date: 2023年02月22日 16:10
 * @Version: 1.0
 **/

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping(value = "/")
    public String HelloWord(Model model) {
        model.addAttribute("msg","你好");
        return "index";
    }
}
