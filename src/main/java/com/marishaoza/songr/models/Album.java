package com.marishaoza.songr.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.net.URL;


@Entity
public class Album {

    // An Album has a title, an artist, a songCount, a length (in seconds), and an imageUrl that is a link to that album’s art.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String title;
    String artist;
    int songCount;
    int lengthInSeconds;
    URL imageUrl;


    // ----------------- Constructors -----------------
    public Album(String title, String artist, int songCount, int lengthInSeconds, URL imageUrl) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.lengthInSeconds = lengthInSeconds;
        this.imageUrl = imageUrl;
    }

    public Album(String title, String artist, String songCount, String lengthInSeconds, URL imageUrl) {
        this.title = title;
        this.artist = artist;
        this.songCount = 0;
        this.lengthInSeconds = 0;
        this.imageUrl = imageUrl;
    }

    public Album(){}


    // ----------------- Getters & Setters -----------------
    public String getTitle() {
        return this.title;
    }

    public String getArtist() {
        return this.artist;
    }

    public int getSongCount() {
        return this.songCount;
    }

    public int getLengthInSeconds() {
        return this.lengthInSeconds;
    }

    public URL getImageUrl() {
        return this.imageUrl;
    }

    public long getId() {
        return this.id;
    }

    // ----------------- Methods -----------------

    public String toString() {
        return String.format("%s by: %s", title, artist);
    }

}
