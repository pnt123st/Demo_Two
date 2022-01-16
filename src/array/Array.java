package array;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        int x [] = new int[5];
        x[0]=100;
        x[4]=1000;
        System.out.println(x[1]);
        System.out.println(x[0]);
        Arrays.sort(x);
        for (int i =0; i<x.length; i ++){
            System.out.println(x[i]);
        }
    }
}
