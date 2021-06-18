package com.example.rectangles;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "rectangles")
public class Rectangle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private int width;
    private int height;
    private String color;
    private String lovedColor;
    private String hatedColor;
}
