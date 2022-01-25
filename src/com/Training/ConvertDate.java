package com.Training;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class ConvertDate {

    public static void date(String str) throws ParseException {
        DateFormat usTime = new SimpleDateFormat("MM-dd-yyyy", Locale.US);
        DateFormat euTime = new SimpleDateFormat("dd-MM-yyyy",Locale.ENGLISH);

        if(str.equals(usTime)){
            Date date = usTime.parse(str);
            String str1=usTime.format(date);
            System.out.println("EU time "+str1);
        }else{
            Date date2 = euTime.parse(str);
            String str2=usTime.format(date2);
            System.out.println("US time "+str2);
        }

    }

    public static void main(String[] args) throws ParseException {
        String euTime="19-11-1990";
        String usTime="11-19-1990";
     date(usTime);
    }
}
