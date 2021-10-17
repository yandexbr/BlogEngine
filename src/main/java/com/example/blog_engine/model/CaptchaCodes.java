package com.example.blog_engine.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "captcha_codes")
@Data
public class CaptchaCodes {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Temporal(TemporalType.DATE)
    private Date time;

    @NotNull
    private Byte code;

    @NotNull
    @Column(name = "secret_code")
    private Byte secretCode;
}
