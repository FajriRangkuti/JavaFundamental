package com.mandiri;

import java.security.KeyStore;
import java.sql.SQLOutput;

public class VariableExample {
    public static void main(String[] args) {
        //assignment '='
        String name = "Angga";
        System.out.println("Hallo "+name);
        //Re-assigment
        name = "Raditya";
        System.out.println("Hello "+ name);

        //concet atau penyambungan
        String number ="12";
        System.out.println(number+3);

        //TypeData Primitive
        short smallNumber = 9999;
        int nonFractionalNumber = 999999999;
        long hugeNonFractionalNumber = 999999999999999999L;

        float singelPrecisionNumber= 3.14f;
        double doublePrecisionNumber = 3.14;

        boolean isOld = true;

        char cityCode = 'A';

        //PrintF
        String newName ="Brucee Wayne";
        String character ="Batman";
        System.out.printf("%s is %s",character,newName);

        boolean lessThan = 3>=7;
        String named ="bruce";
        String anotherName = "Win";
        System.out.println(lessThan);
        System.out.println(named == anotherName);

        boolean andResult = (3>=0) && false;
        boolean orResult = true || false;
        System.out.println("AND="+andResult);
        System.out.println("OR="+orResult);


//        int point = 23;
//        point = point + 3
        //simpelisasi dari yang atas
        int point =23;
        point*=3;
        System.out.println(point);

    }
}
