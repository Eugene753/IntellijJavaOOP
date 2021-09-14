package com.class32.MapsDemo3;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class MapsDemo3 {

    public static void main(String[] args) {
        LinkedHashMap<String,Double>items=new LinkedHashMap<>();
        items.put("soap",5.2);
        items.put("shirt",5.2);
        items.put("pillow",12.0);
        items.put("blanket",8.3);
        System.out.println(items.size());
        System.out.println(items);
        Iterator<String>iterator =items.keySet().iterator();
        while(iterator.hasNext()){
            String item=iterator.next();
            if(item.contains("o")){
                iterator.remove();
            }
        }
        System.out.println(items);



    }
}
