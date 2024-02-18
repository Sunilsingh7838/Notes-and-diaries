package com.company;

import java.util.*;

public
class ArraySearch {

    public static
    void main(String[] args) {
        /*ArrayList<String> nature = new ArrayList<>(Arrays.asList("tree", "flowers", "mountains"));

        ArrayList<String> students = new ArrayList<>();
        students.add("Emmley1");
        students.add("Emmley2");
        students.add("Emmley3");
        students.add("Emmley4");


        System.out.println("All names are : ");
        for( String room : students){
            System.out.println(room);
        }

        String searchName = "Emmley3";
        if(students.contains(searchName)){
            System.out.println("the Name serached for this : " + searchName + " is found." );
        }else {
            System.out.println("Not found!");
        }*/
        // Original int variable
//        int a = 5;
//        Object b = "5";

/*
        if(a instanceof Integer){
            System.out.println("its integer");
        }else {
            System.out.println("not integer");
        }
        String convertedString2 = String.valueOf(a);


        System.out.println("Original int: " + a);
        System.out.println("Converted String 2: " + convertedString2);
*/


    //int num = 5;
    String abc = "Mango";
   // String str = Integer.toString(num);
//    int strToInt =Integer.parseInt(str);
//        System.out.println(str);

//        Map<String,String> counting = new HashMap<>();
//        counting.put("Nitin","111");
//        counting.put("Divya","222");
//        counting.put("Sunil","333");
//        counting.put("abc","444");

       // System.out.println(counting.get("Nitin"));;
//       /* for (Map.Entry<String, String> entry : counting.entrySet()) {
//            System.out.print( entry.getKey() + ": " + entry.getValue());
//        }*/

//        HashSet<String> names = new HashSet<>();
//        names.add("Nitin");
//        names.add("Divya");
//        names.add("Sunil");

//        for(String x:names){
//            System.out.print(x);
//        }

//        ArrayList<String> nature = new ArrayList<>(Arrays.asList("tree", "flowers", "mountains","rocks"));
//        for( String name: nature){
//            System.out.print(name +" ,");
//        }
        String str = "hellow";
        StringBuilder strRev = new StringBuilder(str);
        strRev.reverse().toString();
        System.out.println(strRev);
        

    }
}
