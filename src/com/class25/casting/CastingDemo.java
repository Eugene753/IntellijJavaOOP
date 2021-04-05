package com.class25.casting;

import com.class25.overriding.KFather;
import com.class25.overriding.Khadija;
import com.class25.overriding.Ozoda;

public class CastingDemo {

    public static void main(String[] args) {
        KFather kFather=new Ozoda("Ozoda");
        Ozoda ozoda=(Ozoda)kFather;

        double var1=10.0;
        int var2=(int)var1;

    }
}
