package com.zimaberlin.givit.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @OneToMany(mappedBy = "user")
    private List<Location> locations;
    @OneToMany(mappedBy = "user")
    private List<BuyRequest> buyRequests;
}
