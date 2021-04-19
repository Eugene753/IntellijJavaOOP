package com.advanceJava.PlayList;


import java.lang.reflect.Array;
import java.util.Arrays;

public class Playlist {

   private String name;
   private String creator;
   private Song[]songs=new Song[20];
   final int CAPACITY=20;
   int number=0;

   Playlist(String name,String creator){
       this.name=name;
       this.creator=creator;
   }

   public String getName(){
       return name;
   }

   public void addSong(Song song){
       if(number==songs.length){
           System.out.println("Playlist is full");
       }else {
           songs[number] = song;
           number++;
       }
   }

   public void removeSong(Song song){
       int count=0;
       while(count<songs.length){
           if(song.getName().equals(song.getName())){
                songs[count]=null;
               System.out.println("Song was removed");
                break;
           }else{
               count++;
           }
       }
   }

   public Song[]getSongs(){
       return songs;
   }

   public void print(){
       System.out.println("Name of the playlist: "+getName());
       System.out.println("Creator: "+creator);
       for(Song s:songs)
           System.out.println(s);
       }

   public void menu(){
       System.out.println("Enter your menu options: "
       + "\n Enter 1 if you would like to add a song to your playlist"
       + "\n Enter 2 if you would like to delete song from you playlist"
       + "\n Enter 3 to print your playlist"
       + "\n Enter 4 to exit");

   }
}

