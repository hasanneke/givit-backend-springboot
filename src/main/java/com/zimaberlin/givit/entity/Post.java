package com.zimaberlin.givit.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @OneToMany(mappedBy = "post", fetch = FetchType.LAZY) // post property in BuyRequest class
    private List<BuyRequest> requests;
    @OneToMany(mappedBy = "post")
    private List<PostImage> images;
    @Column(name = "title")
    private String title;
    @Column(name = "detail")
    private String detail;
}
