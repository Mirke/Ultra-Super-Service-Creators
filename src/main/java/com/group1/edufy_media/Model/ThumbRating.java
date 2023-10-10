package com.group1.edufy_media.Model;



import jakarta.persistence.*;

/**
 * <code>ThumbRating</code> - ThumbRating Entity
 *
 * @author Mikael Eriksson (mikael.eriksson@edu.edugrade.se)(Added 9/10/23)
 * @version 0.0.1
 * P0-37, User should be able to rate a media piece. So this class will hold the data of thumbs up and down.
 */

@Entity
@Table(name = "thumb_rating")
public class ThumbRating {


    // -----------------------------------------------------------------------------------------------------------------
    // Properties
    // -----------------------------------------------------------------------------------------------------------------

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "thumbs_up")
    private int thumbUp;

    @Column(name = "thumbs_down")
    private int thumbDown;


    // -----------------------------------------------------------------------------------------------------------------
    // Constructor
    // -----------------------------------------------------------------------------------------------------------------


    public ThumbRating() {
    }

    public ThumbRating( int thumbUp, int thumbDown) {
        this.thumbUp = thumbUp;
        this.thumbDown = thumbDown;
    }

    public ThumbRating(int id, int thumbUp, int thumbDown) {
        this.id = id;
        this.thumbUp = thumbUp;
        this.thumbDown = thumbDown;
    }

    // -----------------------------------------------------------------------------------------------------------------
    // Getter & Setters
    // -----------------------------------------------------------------------------------------------------------------


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getThumbUp() {
        return thumbUp;
    }

    public void setThumbUp(int thumbUp) {
        this.thumbUp = thumbUp;
    }

    public int getThumbDown() {
        return thumbDown;
    }

    public void setThumbDown(int thumbDown) {
        this.thumbDown = thumbDown;
    }

    // -----------------------------------------------------------------------------------------------------------------
    // Methods
    // -----------------------------------------------------------------------------------------------------------------

    public void addOneThumbsUp(){
        this.thumbUp = this.thumbUp + 1;
    }

    public void addOneThumbsDown(){
        this.thumbDown = this.thumbDown + 1;
    }

    public void subtractOneThumbsUp(){
        this.thumbUp = this.thumbUp - 1;
    }

    public void subtractOneThumbsDown(){
        this.thumbDown = this.thumbDown - 1;
    }

    public double getDifferenceBetweenThumbsUpAndDown(){
        return this.thumbUp - this.thumbDown;
    }

    // -----------------------------------------------------------------------------------------------------------------
    // Overwritten Methods
    // -----------------------------------------------------------------------------------------------------------------


    @Override
    public String toString() {
        return "ThumbRating{" +
                "id=" + id +
                ", thumbUp=" + thumbUp +
                ", thumbDown=" + thumbDown +
                '}';
    }
}
