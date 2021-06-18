package com.example.rectangles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @ModelAttribute("selected")
    String selected() {
        return "index";
    }

    @RequestMapping("/")
    private String getIndex() {
        return "index";
    }
}
