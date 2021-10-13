package com.example.blog_engine.model;


import javax.validation.constraints.NotNull;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "users")
public class Users {

    public Users() {}

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


}
