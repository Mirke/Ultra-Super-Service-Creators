package com.group1.edufy_media.Services;

import com.group1.edufy_media.Model.Artist;
import com.group1.edufy_media.Repositories.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistService implements ArtistServiceInterface {

    @Autowired
    ArtistRepository artistRepository;

    @Override
    public List<Artist> getAllArtists() { return artistRepository.findAll(); }



}
