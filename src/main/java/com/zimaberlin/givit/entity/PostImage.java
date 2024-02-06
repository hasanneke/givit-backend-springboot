package com.zimaberlin.givit.entity;

import jakarta.persistence.*;

@Entity(name = "post_image")
public class PostImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "url")
    private String url;
    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;
}
