package com.Repl;

public class repls164 {

    public static  void main(String[] args) {

        Parent [] child={new Child1(),new Child2(),new Child3()};

        for(Parent c:child){
            c.hello();
        }
    }
}
class Parent{
    public void hello(){
        System.out.println("method in Parent class");
    }
}
class Child1 extends Parent{
    public void hello(){
        System.out.println("method in Child1 class");
    }
}
class Child2 extends Parent{
    public void hello(){
        System.out.println("method in Child2 class");
    }
}
class Child3 extends Parent{
    public void hello(){
        System.out.println("method in Child3 class");
    }
}