package com.advanceJava.PlayList;

import java.util.Scanner;

public class MakePlaylist2 {

    public static void main(String[] args) {
        int num;
        int count=0;
        Song[] songs;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter name for the playlist: ");
        String name = scan.nextLine();
        System.out.print("Enter your creator name: ");
        String creator = scan.next();

        Playlist playlist = new Playlist(name, creator);

        while (true) {
            System.out.print("How many song you would like to add: ");
            num = scan.nextInt();
            if (num <= playlist.CAPACITY) {
                songs = new Song[num];
                break;
            } else {
                System.out.print("Max limit is 20: ");
            }
        }

        int pick;
        do {

            playlist.menu();
            pick = scan.nextInt();

            scan.nextLine();

            switch (pick) {
                case 1:
                    if (count < num) {
                        System.out.print("Enter name of song: ");
                        String name1 = scan.nextLine();
                        System.out.print("Enter artist name: ");
                        String artist = scan.nextLine();
                        System.out.print("Enter album: ");
                        String album = scan.nextLine();
                        System.out.print("Enter duration of a song: ");
                        int num1 = scan.nextInt();
                        songs[count] = new Song(name1, artist, album, num1);
                        playlist.addSong(songs[count]);
                        count++;
                        break;
                    }else{
                        System.out.println("You max at your playlist of songs");
                        break;
                    }
                case 2:
                    System.out.println("Enter number of a song you like to delete");
                    int num2=scan.nextInt();
                    playlist.removeSong(songs[num2-1]);
                    break;
                case 3:
                    playlist.print();
                    break;
                case 4:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Wrong input");
                    break;
            }
        }while(pick!=4);
    }
}


