package com.advanceJava.PlayList;


import java.lang.reflect.Array;
import java.util.Arrays;

public class Playlist {

   private String name;
   private String creator;
   private Song[]songs=new Song[20];
   private final int CAPACITY=20;

   Playlist(String name,String creator){
       this.name=name;
       this.creator=creator;
       System.out.println("Name: "+name+" Creator: "+creator);
   }

   public String getName(){
       return name;
   }

   public void addSong(Song song){
       int number=0;
       if(number==songs.length){
           System.out.println("Playlist is full");
       }else {
           songs[number] = new Song(song.getName(), song.getArtist(), song.getAlbum(), song.getTime());
           System.out.println(songs[number]);
           number++;
       }
   }
   public void removeSong(Song song){
       int count=0;
       while(count<songs.length){
           if(songs[count].getName().equals(song.getName())){
                songs[count]=songs[count+1];
               System.out.println(getSongs());
           }
           count++;
       }
   }
   public Song[]getSongs(){
       return songs;
   }



}
