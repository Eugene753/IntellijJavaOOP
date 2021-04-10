package com.advanceJava.PlayList;

public class Song {

    private String name;
    private String artist;
    private String album;
    private int time;
    private static int numSongs;

    Song(String name, String artist, String album, int time) {
        this.name = name;
        this.artist = artist;
        this.album = album;
        this.time = time;
        numSongs++;
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }
    public String getAlbum(){
        return album;
    }
    public int getTime(){
        return time;
    }

    @Override
    public String toString() {
        return
                name +" "+
                artist +" "+
                album +" "+
                time ;
    }
}

