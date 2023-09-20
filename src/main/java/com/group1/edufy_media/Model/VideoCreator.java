package com.group1.edufy_media.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "video_creator")
public class VideoCreator implements ContentContributor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "video_creator_name")
    private String name;
}
