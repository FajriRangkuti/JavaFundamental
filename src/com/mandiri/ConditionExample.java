package com.mandiri;
import java.util.*;
public class ConditionExample {
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
        System.out.print("Input Nilai :");
       int nilai=0;
       nilai = scn.nextInt();

       if(nilai  >= 81 && nilai <= 100){
           System.out.println("A");
       }else if(nilai >=71 && nilai <=80){
           System.out.println("B");
       }else if(nilai >= 50 && nilai <= 70){
           System.out.println("C");
       }else{
           System.out.println("D");
       }

    }
}
