package com.group1.edufy_media.Model;

import jakarta.persistence.*;
/**
 * Author: Lada Egolaeva
 * Description: The Album entity class contains the annotated properties, constructors and methods needed
 * to create an Album object and table in database.
 * */

@Entity
@Table(name = "album")
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "album_name")
    private String name;
    @ManyToOne
    @JoinColumn(name = "creator_id")
    private Artist artist;

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    //constructor
    public Album() {
    }
    public Album(int id, String name) {
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
