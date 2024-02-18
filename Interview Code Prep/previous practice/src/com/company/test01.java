package com.company;

import java.util.Collections;
import java.util.Arrays;
import java.util.Comparator;

public class test01 {
    public static void main(String args[]) {

        Integer [] arr = { 12, 45 ,23 ,66 ,22, 11};

        System.out.print("Arr : " + Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.print("Arr in  order : " + Arrays.toString(arr));

        Arrays.sort(arr, Collections.reverseOrder());

        System.out.print("Arr in revrse order : " + Arrays.toString(arr));



    }
}
