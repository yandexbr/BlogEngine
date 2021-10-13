package com.example.blog_engine.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Tag2post {

    public Tag2post(){
    }

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Column(name = "post_id")
    private Integer postId;

    @NotNull
    @Column(name = "tag_id")
    private Integer tagId;
}
