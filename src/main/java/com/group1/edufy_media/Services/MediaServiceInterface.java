package com.group1.edufy_media.Services;

import com.group1.edufy_media.Model.Media;
import com.group1.edufy_media.Model.Podcast;

import java.util.List;

public interface MediaServiceInterface {

    List<Media> getMediaByContentContributer(int contentContributorId);

    List<Podcast> getPodcastsByContentContributer(int contentContributorId);

}
