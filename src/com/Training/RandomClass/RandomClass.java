package com.Training.RandomClass;

import java.util.Random;
import java.util.stream.DoubleStream;

public class RandomClass {

    public static void main(String[] args) {
        Random random=new Random();
        int d=random.nextInt(60);
        System.out.println(d);

    }
}
