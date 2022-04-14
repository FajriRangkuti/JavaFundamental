package com.mandiri;

public class LoopingExample {
    public static void main(String[] args) {
        for(int i=1; i<5; i++){
            System.out.print(i +"-");
            for (int j = 1; j >=3; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        String [] names = {"Angga","James","Vladimir"};

        for (String name: names) {
            System.out.println(name);
        }
    }
}
