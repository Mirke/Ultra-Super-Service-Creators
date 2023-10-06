package com.group1.edufy_media.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "podcast_creator")
public class PodcastCreator implements ContentContributor {
    @Id
    @Column(name = "podcast_creator_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "podcast_creator_name")
    private String name;

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
