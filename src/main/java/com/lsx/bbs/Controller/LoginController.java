package com.lsx.bbs.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    @RequestMapping("/main")
    public String Login(){
        return "main";
    }
}
