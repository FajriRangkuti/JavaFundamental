package com.mandiri;

public class ReferanceDataType {
    public static void main(String[] args) {
        int a =4;
        Integer b = 7;
        String c = b.toString();

        System.out.println(c+1);
        System.out.println(a+1);

        //String to numerical pasti ada parseNya
        String d = "123";
        Integer f = Integer.parseInt(d);
        System.out.println(f+123);
    }
}
