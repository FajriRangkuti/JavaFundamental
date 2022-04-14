package com.mandiri;
import java.*;
import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        //Array Of String
        String [] names = {"Angga","Bruce","Tonny"};
        //reAssignment Array
        names[1]="Wayne";
        System.out.println(Arrays.asList(names));
        //Access Element
        System.out.println(names[0]);
    }
}
