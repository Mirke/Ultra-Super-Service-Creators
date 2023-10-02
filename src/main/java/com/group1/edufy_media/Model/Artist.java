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
}
