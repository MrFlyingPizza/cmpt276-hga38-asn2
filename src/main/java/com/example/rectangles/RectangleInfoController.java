package com.example.rectangles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class RectangleInfoController {

    @Autowired
    RectangleRepository repository;

    @RequestMapping("/rectangle/{rid}")
    private String getRectanglePage(Model model, @PathVariable long rid) {
        Optional<Rectangle> result = repository.findById(rid);
        if (result.isPresent()) {
            model.addAttribute("rectangle", result.get());
            return "rectangle";
        } else {
            return "error";
        }
    }
}
