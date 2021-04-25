package com.class31.HomeWork;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task2 {

    public static void main(String[] args) {
        Map<Integer,String> bestBuy=new HashMap<>();
        bestBuy.put(12311,"Iphone");
        bestBuy.put(44556,"Corsair Computer");
        bestBuy.put(55877,"Printer");
        bestBuy.put(999624,"ROG Gaming Laptop");
        bestBuy.put(78755454,"Samsun TV");
        bestBuy.put(87845154,"Panasonic TV");
        bestBuy.put(748765125,"Sony Playstation 5");
        bestBuy.put(1123555,"Xbox One");
        bestBuy.put(556777,"Apple Watch");
        bestBuy.put(445575233,"Macbook Pro");

        Set<Map.Entry<Integer,String>> items=bestBuy.entrySet();

        for(Map.Entry<Integer,String> item:items){
            System.out.println(item.getKey()+": "+item.getValue());
        }

    }
}
