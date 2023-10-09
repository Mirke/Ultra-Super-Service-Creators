package com.group1.edufy_media.Model;


import jakarta.persistence.*;

@MappedSuperclass
public abstract class Media {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    //properties
    @Column(name = "media_name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "genre_id")
    private Genre genre;

    @ManyToOne
    @JoinColumn(name = "media_type_id")
    private MediaType mediaType;
    @Column(name = "release_date")
    private String releaseDate;

    @OneToOne
    @JoinColumn(name = "thumbs_rating_id")
    ThumbRating thumbRating;


    //constructors
    public Media() {
    }

    public Media(int id, String name, Genre genre, MediaType mediaType, String releaseDate) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.mediaType = mediaType;
        this.releaseDate = releaseDate;
    }

    //micke

    public Media(int id, String name, Genre genre, MediaType mediaType, String releaseDate, ThumbRating thumbRating) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.mediaType = mediaType;
        this.releaseDate = releaseDate;
        this.thumbRating = thumbRating;
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

    public Genre getGenre() {
        return genre;
    }
    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public MediaType getMediaType() {
        return mediaType;
    }
    public void setMediaType(MediaType mediaType) {
        this.mediaType = mediaType;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    //micke

    public ThumbRating getThumbRating() {
        return thumbRating;
    }

    public void setThumbRating(ThumbRating thumbRating) {
        this.thumbRating = thumbRating;
    }


    //toString

    @Override
    public String toString() {
        return "Media{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", genre=" + genre +
                ", mediaType=" + mediaType +
                ", releaseDate='" + releaseDate + '\'' +
                ", thumbRating=" + thumbRating +
                '}';
    }
}
