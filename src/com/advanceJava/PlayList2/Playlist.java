package com.advanceJava.PlayList2;

public class Playlist {
    private String name;
    private String creator;
    private Song[] songs;
    final int CAPACITY = 20;
    private int size;

    public Playlist(String name, String creator) {
        this.name = name;
        this.creator = creator;
        this.songs = songs;
        songs = new Song[CAPACITY];
    }

    public String getName() {
        return name;
    }

    void addSong(Song song) {
        songs[size++] = song;
    }

    void removeSong(Song songToRemove) {
        int counter=0;
        for (Song song :songs
        ) {

            if(song.getName().equals(songToRemove.getName())){
                songs[counter]=null;
            }
            counter++;
        }
    }

    public Song[] getSongs() {
        return songs;
    }

}
