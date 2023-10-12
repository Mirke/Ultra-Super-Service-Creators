package com.group1.edufy_media.Model;

import com.group1.edufy_media.Model.Security.Users;
import jakarta.persistence.*;

@Entity
@Table(name = "genre_preference")
public class GenrePreference {


    // Properties:

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH, CascadeType.PERSIST})
    @JoinColumn(name = "username")
    private Users user;

    @ManyToOne
    @JoinColumn(name = "genre_id")
    private Genre genre;

    @Column(name = "timesLiked")
    private int timesLiked;


    // Constructors:

    public GenrePreference() {
    }

    public GenrePreference(int id, Users user, Genre genre, int timesLiked) {
        this.id = id;
        this.user = user;
        this.genre = genre;
        this.timesLiked = timesLiked;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
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
