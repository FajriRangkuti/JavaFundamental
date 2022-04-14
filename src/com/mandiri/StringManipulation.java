package com.mandiri;

import java.util.Arrays;
import java.util.Locale;

public class StringManipulation {
    public static void main(String[] args) {
        String someText = "Angga;23;M;Jakarta";
        String [] element = someText.split(";");

        for (int i = 0; i < element.length; i++) {
            System.out.println(element[i]);
        }

        char[] chars = someText.toCharArray();
        System.out.println(Arrays.toString(chars));

        String upperCase = someText.toUpperCase();
        System.out.println(upperCase);
    }
}
