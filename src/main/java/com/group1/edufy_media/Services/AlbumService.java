package com.group1.edufy_media.Services;

import com.group1.edufy_media.Model.Album;
import com.group1.edufy_media.Repositories.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlbumService implements AlbumServiceInterface {

    @Autowired
    private AlbumRepository albumRepository;

    @Override
    public List<Album> getAllAlbums() {
        return albumRepository.findAll();
    }

    @Override
    public Optional<Album> getAlbumsByCreatorId(int creatorId) {
        return albumRepository.findById(creatorId);
    }
}
