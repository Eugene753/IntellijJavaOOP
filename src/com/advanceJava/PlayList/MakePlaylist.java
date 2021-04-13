package com.advanceJava.PlayList;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class MakePlaylist {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter name for the playlist: ");
        String name=scan.nextLine();
        System.out.print("Enter your creator name: ");
        String creator=scan.next();

        Playlist playlist=new Playlist(name,creator);
        Song[] songs=new Song[playlist.CAPACITY];


         songs[0]=new Song("I'm Still Standing","Elton John","Rocket Man",4008);
         songs[1]=new Song("Take on Me","a-ha","Hunting High and Low",3450);
         songs[2]=new Song("Against All Odds","Phil Collins","The Singles",3260);
         songs[3]=new Song("I Wanna Dance with Somebody","Whitney Houston","Whitney",4510);
         songs[4]=new Song("Smalltown Boy","Bronski Beat","The Age",5002);
         songs[5]=new Song("Good Life","Inner City","Paradise",4050);
         songs[6]=new Song("Tell it to My Heart","Taylor Dayne","Tell it to My heart",3400);
         songs[7]=new Song("The Best","Tina Turner","Simply the Best",4140);
         songs[8]=new Song("Maniac","Michael Sembello","Flashdance",4050);
         songs[9]=new Song("Blue Monday","New Order","The Best of New Order",4050);
         songs[10]=new Song("Strange love","Depeche Mode","Music for the Masses",4550);
         songs[11]=new Song("Self Control","Laura Branigan","Self Control",4060);
         songs[12]=new Song("Cheri Cheri Lady","Modern Talking","Let's Talk About Love",3460);
         songs[13]=new Song("Holiday","Madonna","Madonna",3520);
         songs[14]=new Song("Dancing On The Ceiling","Lionel Richie","Dancing On The Ceiling",4310);
         songs[15]=new Song("Rebel Yell","Billy Idol","Greatest Hits",4470);
         songs[16]=new Song("Club Tropicana","Wham","Fantastic",4260);
         songs[17]=new Song("The Look Of Love","ABC","The Lexicon Of Love",3290);
         songs[18]=new Song("Kids In America","Kim Wilde","Kim Wilde",3260);
         songs[19]=new Song("Money For Nothing","Dire Straits","Brothers In Arms",8310);


        int pick;
        do {

            playlist.menu();
             pick = scan.nextInt();

             scan.nextLine();

            switch (pick) {
                case 1:
                    System.out.print("Enter song you would like to add: ");
                    int num=scan.nextInt();
                    playlist.addSong(songs[num-1]);
                    break;
                case 2:
                    System.out.println("Enter number of a song you like to delete");
                    int num1=scan.nextInt();
                    playlist.removeSong(songs[num1]);
                    break;
                case 3:
                    playlist.print();
                    break;
                case 4:
                    System.out.println("Wrong input");
                    break;
            }
        }while(pick!=3);




       /* System.out.print("Enter name of the song: ");
        String name1=scan.nextLine();
        System.out.print("Enter artist: ");
        String artist=scan.nextLine();
        System.out.print("Enter album: ");
        String album=scan.nextLine();*/

















    }

}
