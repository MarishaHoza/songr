package com.marishaoza.songr.models;

import javax.persistence.*;


@Entity
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String title;
    int lengthInSeconds;
    int trackNumber;
    @ManyToOne
    Album album;

    // ----------------- Constructors -----------------
    public Song(String title, int lengthInSeconds, int trackNumber, Album album){
        this.title = title;
        this.lengthInSeconds = lengthInSeconds;
        this.trackNumber = trackNumber;
        this.album = album;
    }

    public Song(){}

    // ----------------- Getters & Setters -----------------
    public long getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public int getLengthInSeconds() {
        return this.lengthInSeconds;
    }

    public int getTrackNumber() {
        return this.trackNumber;
    }

    public Album getAlbum() {
        return this.album;
    }

    // ----------------- Methods -----------------
    public String toString() {
        return String.format("%s, track number %d on album %s", this.title, this.trackNumber, this.album.getTitle());
    }

}
