package com.example.rectangles;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RectangleInfoController {

    @RequestMapping("/rectangle")
    private String getRectanglePage(Model model) {
        Rectangle rectangle = new Rectangle();
        model.addAttribute("rectangle", rectangle);
        return "rectangle";
    }
}
