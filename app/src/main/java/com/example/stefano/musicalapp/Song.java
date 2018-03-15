package com.example.stefano.musicalapp;

/**
 * Created by stefano on 13/03/2018.
 */

public class Song {

    private String artist;
    private String song;

    //constructor: shall have the same name of the class
    public Song (String artist, String song){
        this.artist = artist;
        this.song = song;
    }
    //public method: get the name of the song
    public String getSong(){
        return song;
    }

    //public method: get the name of the artist
    public String getArtist(){
        return artist;
    }

}
