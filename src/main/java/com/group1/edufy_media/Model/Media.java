package com.group1.edufy_media.Model;

public abstract class Media {
    //properties
    /**
     * Needs id property as well?
     */
    private String name;
    private Genre genre;
    private MediaType mediaType;
    private String releaseDate;


    //constructors
    public Media() {
    }

    public Media(String name, Genre genre, MediaType mediaType, String releaseDate) {
        this.name = name;
        this.genre = genre;
        this.mediaType = mediaType;
        this.releaseDate = releaseDate;
    }

    //getters & setters
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

    //toString

    @Override
    public String toString() {
        return "Media{" +
                "name='" + name + '\'' +
                ", genre=" + genre +
                ", mediaType=" + mediaType +
                ", releaseDate='" + releaseDate + '\'' +
                '}';
    }
}
