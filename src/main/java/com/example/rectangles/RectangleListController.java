package com.example.rectangles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Iterator;

@Controller
public class RectangleListController {

    @Autowired
    RectangleRepository repository;

    @ModelAttribute("selected")
    String selected() {
        return "list_rectangles";
    }

    @RequestMapping("/list_rectangles")
    private String list_rectangles(Model model) {
        Iterable<Rectangle> rectangles = repository.findAll();
        model.addAttribute("rectangles", rectangles);
        return "list_rectangles";
    }

}
