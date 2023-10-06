package com.group1.edufy_media.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "video_creator")
public class VideoCreator implements ContentContributor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "video_creator_id")
    private int id;

    @Column(name = "video_creator_name")
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
