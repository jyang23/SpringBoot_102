package com.jy.springboot_102;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String homePage(Model model)
    {
        model.addAttribute("myvar", "Say Hello to the people.");
        model.addAttribute("myvar2", "Say Goodbye to the people.");

        return "hometemplate";
    }
}
