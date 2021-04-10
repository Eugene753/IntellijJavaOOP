package com.advanceJava.PlayList;

import java.util.Arrays;
import java.util.Scanner;

public class MakePlaylist {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter name for the playlist");
        String name=scan.nextLine();
        System.out.println("Enter your creator name");
        String creator=scan.nextLine();

        Playlist playlist=new Playlist(name,creator);

        Song song=new Song("Last Resort","Papa Roach","My Life",2800);
        Song song1=new Song("My Love","Veronica","Love",3600);
        Song song2=new Song("Last Resort","Papa Roach","My Life",2800);
        Song song3=new Song("Last Resort","Papa Roach","My Life",2800);
        Song song4=new Song("Last Resort","Papa Roach","My Life",2800);
        Song song5=new Song("Last Resort","Papa Roach","My Life",2800);
        Song song6=new Song("Last Resort","Papa Roach","My Life",2800);
        Song song7=new Song("Last Resort","Papa Roach","My Life",2800);
        Song song8=new Song("Last Resort","Papa Roach","My Life",2800);


        playlist.addSong(song);
        playlist.addSong(song1);
        playlist.addSong(song2);
        playlist.addSong(song3);
        playlist.addSong(song4);
        playlist.addSong(song5);
        playlist.addSong(song6);
        playlist.addSong(song7);
        playlist.addSong(song8);
        playlist.removeSong(song1);


















    }

}
