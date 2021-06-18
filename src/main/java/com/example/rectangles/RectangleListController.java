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

@Controller
public class RectangleListController {



    @Autowired
    DataSource dataSource;

    @ModelAttribute("selected")
    String selected() {
        return "list_rectangles";
    }

    @RequestMapping("/list_rectangles")
    private String list_rectangles(Model model) {
        try {
            String sql = "SELECT * FROM rectangles";
            Statement statement = dataSource.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
        return "list_rectangles";
    }

}
