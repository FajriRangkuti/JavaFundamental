package com.mandiri;
import java.util.*;

public class SubmissionTime {
    public static void main(String [] args){
         int time1 =8;
         int time2 =17;

         int input1 = 8;
         int input2 = 12;
         int input3 = 23;

        if(input1 >= time1 && input1 <= time2  ){
            System.out.println("Succes");
        }
         if(input2 < time2 && input2 > time1 ){
            System.out.println("Succes");
        }
         if(input3 > time2 && input3 > time1 ) {
            System.out.println("Failed");
        }

    }
}
