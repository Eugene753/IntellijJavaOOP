package com.Training;

import java.util.*;

public class Repl208 {

    private static Object String;

    public static void main(String[] args){
        List<Map<String,Object>> dataList=new LinkedList<>();
        Map<String,Object> appleMap=new LinkedHashMap<>();

        appleMap.put("Items","Apple");
        appleMap.put("Price",20.00);
        appleMap.put("Quantity",10.0);
        dataList.add(appleMap);

        Map<String,Object> orangeMap=new LinkedHashMap<>();
        orangeMap.put("Items","Orange");
        orangeMap.put("Price",21.99);
        orangeMap.put("Quantity",10.0);

        dataList.add(orangeMap);

        String str="";
        String str2="";
        Double subTotal =0.0;
        Double totalPurchase=0.0;

        for(Map<String,Object> map:dataList){

            for(Map.Entry<String,Object> set:map.entrySet()){

                str=set.getKey();
                str2=set.getValue().toString();
                System.out.print(str+": "+str2+" ");

                if(str.equals("Items")){
                    continue;
                }else{
                    if(subTotal==0.0) {
                        subTotal = (Double.parseDouble(str2));
                    }else {
                        subTotal*=(Double.parseDouble(str2));
                    }
                }
            }
            System.out.println("SubTotal: "+subTotal);
            System.out.println();
            totalPurchase+=subTotal;
            subTotal=0.0;
        }
        System.out.println("Your Purchase total : "+ totalPurchase);

        String str1="";
        String str3="";

        Double purchaseSubtotal=0.0;
        for(Map<String,Object> map:dataList){
            Set<String> set=map.keySet();
            Iterator<String> iterator=set.iterator();
            while(iterator.hasNext()){
                str=iterator.next();
                String obj=  map.get(str).toString();

                System.out.print(str+": "+obj+": ");
                if(obj.equalsIgnoreCase("Apple")||obj.equalsIgnoreCase("Orange")){
                    continue;
                }else{

                    if(subTotal==0.0){
                        subTotal+=(Double.parseDouble(obj));
                    }else{
                        subTotal*=(Double.parseDouble(obj));
                    }
                }

            }
            System.out.print("Subtotal "+subTotal);
            System.out.println();
            purchaseSubtotal+=subTotal;
            subTotal=0.0;
        }

        System.out.println("Your purchase total: "+purchaseSubtotal);

    }
    }

