package com.zimaberlin.givit.entity;

import jakarta.persistence.*;

@Entity(name = "locations")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "state")
    private String state;
    @Column(name = "city")
    private String city;
    @Column(name = "neighborhood")
    private String neighborhood;
    @Column(name = "street")
    private String street;
    @Column(name = "door_number")
    private String doorNumber;
    @Column(name = "flat_number")
    private String flatNumber;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
