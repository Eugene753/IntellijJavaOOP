package com.class32.MapsDemo4;

import org.apache.batik.gvt.text.ArabicTextHandler;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class MapsDemo4 {

    public static void main(String[] args) {
        LinkedHashMap<String,Double> items=new LinkedHashMap<>();
        items.put("soap",5.2);
        items.put("shirt",5.2);
        items.put("pillow",12.0);
        items.put("blanket",8.3);
        Collection<Double>values=items.values();
        //ArrayList<Double> arrayList=new ArrayList<>(values);
        Iterator<Double>iterator=values.iterator();
        while(iterator.hasNext()){
            Double price=iterator.next();
            if(price>10){
                iterator.remove();
            }
        }
        System.out.println(items);

    }
}
