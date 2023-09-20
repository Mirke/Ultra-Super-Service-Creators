package com.group1.edufy_media.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "media_type")
public class MediaType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "media_type_name")
    private String name;
}
