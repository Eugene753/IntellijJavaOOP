package com.advanceJava.PlayList2;

import java.util.Random;
import java.util.Scanner;

public class MakePlaylist {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String playlistName, creator,songName,songArtist,songAlbum;
        int numberOfSongs,songTime;
        System.out.println("Enter a name for the playlist");
        playlistName=scanner.nextLine();
        System.out.println("Enter your Name");
        creator=scanner.nextLine();
        System.out.println("Please Enter the number of songs MAX 20 taht you want to add to playlist");

        while(true){
            numberOfSongs=scanner.nextInt();
            if(numberOfSongs>0 && numberOfSongs<=20){
                break;
            }else{
                System.out.println("Wrong input Please Enter the number of songs MAX 20");
            }
        }

        Playlist playlist=new Playlist(playlistName,creator);

        for(int i=0;i<numberOfSongs;i++){
            Scanner songScanner=new Scanner(System.in);
            System.out.println("Enter the name of the Song");
            songName=songScanner.nextLine();

            System.out.println("Enter the name of the Artist");
            songArtist=songScanner.nextLine();

            System.out.println("Enter the name of teh Album");
            songAlbum=songScanner.nextLine();

            System.out.println("Enter the time of Song");
            songTime=songScanner.nextInt();

            Song song=new Song(songName,songArtist,songAlbum,songTime);
            playlist.addSong(song);
        }
        while(true){
            System.out.println("Enter number of songs to Queue from Playlist or -1 to terminate the program");
            int numQueue=scanner.nextInt();
            if(numQueue==-1){
                break;
            }
            if(numQueue<1|| numQueue>numberOfSongs){
                System.out.println("Invalid input try again");
                continue;
            }
            else{
                for(int i=0;i<numQueue;i++){
                    Random random=new Random();
                    int randomSongNum=random.nextInt(numberOfSongs);
                    Song randomSong=playlist.getSongs()[randomSongNum];
                    System.out.println("Song Name "+randomSong.getName());
                    System.out.println("Song Artist "+randomSong.getArtist());
                    System.out.println("Song Album "+randomSong.getAlbum());
                    System.out.println("Song Duration "+randomSong.getTime());
                    System.out.println();
                }
            }
        }
    }
}
