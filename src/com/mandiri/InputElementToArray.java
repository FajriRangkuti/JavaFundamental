package com.mandiri;
import java.sql.SQLOutput;
import java.util.*;

public class InputElementToArray {

    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);

        Integer [] numbers = {2,5,1,25,6,84};
        Integer [] numbers2 = {1,3,8,2,5,25,73};

        Integer count =0;
        for (int i = 0; i < numbers.length; i++) {
            //System.out.println(Arrays.toString(numbers2));
            for (int j = 0; j < numbers2.length; j++) {
                if(numbers[i] == numbers2[j]){
                    System.out.println(numbers2[j]);
                }

            }
        }


//        Challange 2
//        for (int i = 0; i < numbersTwoTmes.length; i++) {
//           numbers[i] = numbers[i] * 2;
//            numbersTwoTmes[i] *= 2
//        }
//        System.out.println(Arrays.toString(numbers));


//        Challange 1
//        for(int i = 0; i<numbers.length; i++){
//            System.out.print("Input Numbers: ");
//            numbers[i] = scn.nextInt();
//            System.out.println(Arrays.toString(numbers));
//        }
//


    }

}
