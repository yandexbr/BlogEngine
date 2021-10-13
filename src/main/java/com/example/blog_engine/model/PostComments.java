package com.example.blog_engine.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "post_comments")
public class PostComments {

    public PostComments(){
    }

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "parent_id")
    private Integer parentId;

    @NotNull
    @Column(name = "post_id")
    private Integer postId;

    @NotNull
    @Column(name = "user_id")
    private Integer userId;

    @NotNull
    @Temporal(TemporalType.DATE)
    private Date time;

    @NotNull
    private String text;
}
