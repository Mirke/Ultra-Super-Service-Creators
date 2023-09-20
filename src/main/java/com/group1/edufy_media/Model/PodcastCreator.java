package com.group1.edufy_media.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "podcast_creator")
public class PodcastCreator implements ContentContributor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "podcast_creator_name")
    private String name;

}
