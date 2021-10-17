package com.example.blog_engine.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "post_comments")
@Data
public class PostComments {

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

    @ManyToOne
    @JoinColumn(name = "users_id")
    Users users;

    @ManyToOne
    @JoinColumn(name = "posts_id")
    Posts posts;
}
