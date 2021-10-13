package com.example.blog_engine.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "posts")
public class Posts {

    public Posts() {
    }

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Column(name = "is_active")
    private Byte isActive;

    @NotNull
    @Enumerated
    private ModerationStatus moderationStatus = ModerationStatus.NEW;

    @Column(name = "moderator_id")
    private Integer moderatorId;

    @NotNull
    @Column(name = "user_id")
    private Integer userId;

    @NotNull
    @Temporal(TemporalType.DATE)
    private Date time;

    @NotNull
    private String title;

    @NotNull
    private String text;

    @NotNull
    @Column(name = "view_count")
    private Integer viewCount;
}
