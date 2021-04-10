package com.class25.ClassTask;

public class Student {

    public void study(){ System.out.println("Students studying hard"); }
    public void sleep(){
        System.out.println("Students like to sleep");
    }
    public void eat(){ System.out.println("Students like to eat"); }
}

class SyntaxStudent extends Student{
    public void study(){
        System.out.println("Syntax Students studying hard to get a job");
    }
    public void sleep(){
        System.out.println("Syntax Students like to sleep so they can study hard");
    }
    public void eat(){
        System.out.println("Syntax Students like to eat so they can feel better");
    }
    public void work(){
        System.out.println("Syntax Students part time working so they can get experience");
    }

}
class CollegeStudent extends Student{
    public void study(){
        System.out.println("College Students studying hard to know more");
    }
    public void sleep(){
        System.out.println("College Students like to sleep so they rest");
    }
    public void eat(){
        System.out.println("College Students like to eat so they party");
    }
    public void party(){
        System.out.println("College Students like to party so they can relax");
    }
}
class SchoolStudent extends Student{
    public void study(){
        System.out.println("School Students studying hard so they can get into college");
    }
    public void sleep(){
        System.out.println("School Students like to sleep, cause they play video games");
    }
    public void eat(){
        System.out.println("School Students like to eat cause they need to grow");
    }
    public void playVideoGames(){
        System.out.println("School Students like to play video, cause they study hard");
    }

}