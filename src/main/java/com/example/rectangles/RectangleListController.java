package com.example.rectangles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

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
        ArrayList<Rectangle> rectangles = (ArrayList<Rectangle>) repository.findAll();
        model.addAttribute("rectangles", rectangles);
        return "list_rectangles";
    }

}
