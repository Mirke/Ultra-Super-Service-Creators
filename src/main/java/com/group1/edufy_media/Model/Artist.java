package com.group1.edufy_media.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "artist")
public class Artist implements ContentContributor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "artist_id")
    private int id;
    @Column(name = "artist_name")
    private String name;


    //constructors
    public Artist() {
    }
    public Artist(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //getters & setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
