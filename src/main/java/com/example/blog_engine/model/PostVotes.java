package com.example.blog_engine.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "post_votes")
@Data
public class PostVotes {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Column(name = "user_id")
    private Integer userId;

    @NotNull
    @Column(name = "post_id")
    private Integer postId;

    @NotNull
    @Temporal(TemporalType.DATE)
    private Date time;

    @NotNull
    @NotNull
    private Byte value;

    @ManyToOne
    @JoinColumn(name = "users_id")
    Users users;

    @ManyToOne
    @JoinColumn(name = "posts_id")
    Posts posts;
}
