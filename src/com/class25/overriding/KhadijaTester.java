package com.class25.overriding;

public class KhadijaTester {

    public static void main(String[] args) {
        Object[]arr={("Test"),new Khadija("hjdhf")};
        KFather obj1=new Ozoda("Ozoda");
        obj1.eat();
        obj1.sleep();
        KFather[] kFatherArr={new KFather("Mirza"),new Ozoda("Ozoda"),new Khadija("Khadija")};
        executeAllMethods(kFatherArr);
    }

    /*static void executeAllMethods(KFather kFather,Ozoda ozoda,Khadija khadija){
    kFather.eat();
    kFather.sleep();
    ozoda.eat();
    ozoda.sleep();
    khadija.sleep();
    khadija.eat();
    }*/

    static void executeAllMethods(KFather[] kFatherarr){
        for(KFather kFather:kFatherarr){
            kFather.eat();
            kFather.sleep();
        }
    }


}
