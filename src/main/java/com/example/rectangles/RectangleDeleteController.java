package com.example.rectangles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RectangleDeleteController {

    @Autowired
    RectangleRepository repository;

    @PostMapping("/delete")
    private String deleteRectangle(@RequestParam long rid) {
        repository.deleteById(rid);
        return "redirect:/list_rectangles";
    }
}
