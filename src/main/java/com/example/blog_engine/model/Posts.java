package com.example.blog_engine.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "posts")
@Data
public class Posts {

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

    @ManyToOne
    @JoinColumn(name = "users_id")
    Users users;

    @OneToMany
    @JoinColumn(name = "posts")
    Set<PostVotes> postVotes;

    @OneToMany
    @JoinColumn(name = "posts")
    Set<PostComments> postComments;

    @ManyToMany
    @JoinTable(
            name = "tag2post",
            joinColumns = @JoinColumn(name = "post_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id"))
    Set<Tags> tagsSet;
}
