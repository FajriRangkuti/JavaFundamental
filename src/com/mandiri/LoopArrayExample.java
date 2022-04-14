package com.mandiri;

import java.util.Arrays;

public class LoopArrayExample {
    public static void main(String[] args) {
        String [] names = {"Bruce","Strange","Peter","Stave","Tony"};
        for (int i = 0; i< names.length; i++){
            System.out.println(names[i]);
        }

        Integer [] numbers = new Integer[5];
        numbers[1] = 7;
        System.out.println(Arrays.toString(numbers));
    }
}
