package com.group1.edufy_media.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "genre_preference")
public class GenrePreference {


    // Properties:

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH, CascadeType.PERSIST})
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "genre_id")
    private Genre genre;

    @Column(name = "timesLiked")
    private int timesLiked;


    // Constructors:

    public GenrePreference() {
    }

    public GenrePreference(int id, Genre genre, User user, int timesLiked) {
        this.id = id;
        this.genre = genre;
        this.user = user;
        this.timesLiked = timesLiked;
    }


    // Methods:


    // Getters and Setters:


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public int getTimesLiked() {
        return timesLiked;
    }

    public void setTimesLiked(int timesLiked) {
        this.timesLiked = timesLiked;
    }
}
