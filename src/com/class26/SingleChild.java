package com.class26;

public class SingleChild {
    void method1(){
        System.out.println("bla bla");
    }

}
class Child1 extends SingleChild{

    void method1(){
        System.out.println("Bla bla from child");
    }
    void method2(){
        System.out.println("method 2");
    }
}

class Child2 extends SingleChild{

    void method1(){
        System.out.println("Bla bla from child");
    }
    void method3(){
        System.out.println("method 2");
    }
}
class Tester{
    public static void main(String[] args) {
        SingleChild[] child={new Child1(),new Child2()};
        for(SingleChild child1:child){
            if(child1 instanceof Child1){
                ((Child1)child1).method2();
            }else if(child1 instanceof Child2){
                ((Child2)child1).method3();
            }

        }
    }
}
