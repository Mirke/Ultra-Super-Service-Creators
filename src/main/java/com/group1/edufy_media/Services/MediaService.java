package com.group1.edufy_media.Services;

import com.group1.edufy_media.Model.Media;
import com.group1.edufy_media.Repositories.MediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MediaService implements MediaServiceInterface{

    @Autowired
    private MediaRepository mediaRepository;

    @Override
    public List<Media> findAllMedia() {
        return mediaRepository.findAll();
    }
}
