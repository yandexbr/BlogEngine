package com.example.blog_engine.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tags")
public class Tags {

    public Tags(){
    }

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    private String name;
}
