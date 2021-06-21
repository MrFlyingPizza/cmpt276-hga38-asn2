package com.example.rectangles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RectangleCreateController {

    @Autowired
    RectangleRepository repository;

    @ModelAttribute("selected")
    String selected() {
        return "new_rectangle";
    }

    @GetMapping("/new_rectangle")
    private String getRectangleForm(Model model) {
        model.addAttribute("rectangle", new Rectangle());
        return "new_rectangle";
    }

    @PostMapping("/new_rectangle")
    private String submitRectangleForm(@ModelAttribute Rectangle rectangle, Model model) {
        repository.save(rectangle);
        model.addAttribute("success", true);
        model.addAttribute("rectangle", rectangle);
        return "result";
    }
}
