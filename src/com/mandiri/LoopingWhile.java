package com.mandiri;
import com.sun.org.apache.bcel.internal.generic.BREAKPOINT;

import  java.util.*;
import java.sql.SQLOutput;

public class LoopingWhile {
    public static void main(String[] args) {
        Integer count = 0;
        Scanner scn = new Scanner(System.in);
        while (count<1){
            System.out.println(count);
            count++;
        }

        while(true){
            System.out.println("1.Tes");
            System.out.println("2.Exit");
            System.out.print("Enter : ");
            String command = scn.nextLine();

            if(command.equals("2")){
                System.out.println("-------Terimakasih----");
                break;
            }else if(command.equals("1")){
                System.out.println("CILUK BA");
                String cmd = scn.nextLine();
            }
        }
    }
}
