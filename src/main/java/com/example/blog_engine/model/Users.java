package com.example.blog_engine.model;


import lombok.Data;

import javax.validation.constraints.NotNull;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "users")
@Data
public class Users {

    @Id
    @NotNull
    private Integer id;

    @NotNull
    @Column(name = "is_moderator")
    private Byte isModerator;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "reg_time")
    private Date regTime;

    @NotNull
    @Column(length = 255)
    private String name;

    @NotNull
    @Column(length = 255)
    private String email;

    @NotNull
    @Column(length = 255)
    private String password;

    @NotNull
    @Column(length = 255)
    private String code;

    @NotNull
    private String photo;

    @OneToMany()
    @JoinColumn(name = "users")
    private Set<Posts> posts;

    @OneToMany()
    @JoinColumn(name = "users")
    private Set<PostComments> postComments;

    @OneToMany()
    @JoinColumn(name = "users")
    private Set<PostVotes> postVotes;
}
