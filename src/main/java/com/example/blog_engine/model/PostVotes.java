package com.example.blog_engine.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "post_votes")
public class PostVotes {

    public PostVotes(){
    }

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
}
