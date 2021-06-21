package com.example.rectangles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class RectangleDeleteController {

    @Autowired
    RectangleRepository repository;

    @PostMapping("/delete")
    private String deleteRectangle(@RequestParam long rid, Model model) {
        Optional<Rectangle> name = repository.findById(rid);
        repository.deleteById(rid);
        if (name.isPresent()) {
            model.addAttribute("name", name.get());
            return "delete_confirmation";
        } else {
            return "error";
        }
    }
}
