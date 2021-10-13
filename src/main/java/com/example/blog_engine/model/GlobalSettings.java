package com.example.blog_engine.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "global_settings")
public class GlobalSettings {

    public GlobalSettings(){
    }

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    private String code;

    @NotNull
    private String name;

    @NotNull
    private String value;
}
