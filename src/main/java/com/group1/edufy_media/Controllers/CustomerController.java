package com.group1.edufy_media.Controllers;

import com.group1.edufy_media.Model.*;
import com.group1.edufy_media.Services.GenreService;
import com.group1.edufy_media.Services.PodcastCreatorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/edufy")
public class CustomerController {

    /* PROPERTIES:

    - All the different services that we need.
        -userService
        -mediaService
        -albumService
    - Possibly a logger.

     */

    @Autowired
    private GenreService genreService;

    @Autowired
    private PodcastCreatorService podcastCreatorService;

    // Constructors:
    public CustomerController() {

    }

    // Methods:
//
//    @GetMapping("/mediabyspecificcontentcontributer/{id}")
//        public List<Media> allMediaByASpecificContentContributer (@PathVariable("id") int contentContributorId) {
//
//        return mediaService.getMediaByCreator(contentContributorId);
//
//    }
//
//    @GetMapping("/topmediaforuser/{id}")
//    public List<Media> topthreemediaforauser (@PathVariable("id") int userId) {
//
//        return userService.getTopThreeMedia(userId);
//
//    }
//
//    @GetMapping("recommendedmediaforuser/{id}")
//    public List<Media> getRecommendedMediaForAUser (@PathVariable("id") int userId) {
//
//        // This endpoint will be the most complex one since it will require a lot of logic from the service-class since it should provide a
//        // recommendation of 10 media that has not been played for a user and also should  be suited for the user based on it’s preferred genre.
//
//        return userService.getRecommendedMedia(userId);
//
//    }
//
//    @GetMapping ("allalbumsforacreator/{id}")
//    public List<Album> getAllAlbumsForAContentCreator (@PathVariable("id") int contentCreatorId) {
//
//        return albumService.getAllAlbumsForACreator(contentCreatorId);
//
//    }
//
//
//    @PutMapping ("user/{userId}/playmedia/{mediaId}")
//    public void userPlaysMedia (@PathVariable("userId") int userId, @PathVariable("mediaId") int mediaId) {
//
//        // This endpoint should contain the logic that adds the media to the user array of the media played.
//        // AND also add the number of times that this media has been played.
//
//        userService.addMediaToPlayedList(userId, mediaId);
//
//    }
//
//    @PutMapping ("user/{userId}/likemedia/{mediaId}")
//    public void userLikesMedia (@PathVariable("userId") int userId, @PathVariable("mediaId") int mediaId) {
//
//        // This endpoint should register if the genre of the media is LIKED by the user and
//        // then add this to a “likedGenresArrayList” that later can be checked to provide other media that the user like.
//
//        userService.addMediagenreToLiked(userId, mediaId);
//
//    }
//
//    @PutMapping ("user/{userId}/dislikemedia/{mediaId}")
//    public void userDislikesMedia (@PathVariable("userId") int userId, @PathVariable("mediaId") int mediaId) {
//
//        // This endpoint should register if the genre of the media is DISLIKED by the user and
//        // then add this to a “dislikedGenresArrayList” that later can be checked to provide other media that the user like.
//
//        userService.addMediagenreToDisliked(userId, mediaId);
//
//    }

    @GetMapping("/getAllGenres/")
    public List<Genre> getAllGenres(){
        return genreService.getAllGenres();
    }
    @GetMapping("/getAllPodcastCreators/")
    public List<PodcastCreator> getAllPodcastCreators(){
        return podcastCreatorService.getAllPodcastCreators();
    }

}
