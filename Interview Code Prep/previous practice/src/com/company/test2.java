package com.company;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

class Person implements Serializable {
    private String name;
    private transient int age; // Marked as transient

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
class Solution {

    public static void main(String[] args) {
       // String filePath = "C:\\Users\\SUNIL\\IdeaProjects\\untitled4\\src\\com\\company\\demo.txt";
//        try {
//            byte[] fileBytes = Files.readAllBytes(Paths.get(filePath));
//
//            // Convert the byte array to a string and print
//            System.out.println(new String(fileBytes));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        /////////////Writing to file.txt////////////
//        String filePath1 = "C:\\Users\\SUNIL\\IdeaProjects\\untitled4\\src\\com\\company\\demo.txt";
//        String text = "This is 3rd inserted text sent via in file(I/O) operations.";
//        String number = "214324";
//
//        try {
//            Files.write(Paths.get(filePath1), number.getBytes(),
//                        StandardOpenOption.APPEND);
//            System.out.println("Data saved successfully!...");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        // Serialization example
//        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
//            Person person = new Person("John", 30);
//            oos.writeObject(person);
//            System.out.println("Object Saved!...");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        // Deserialization
        // Deserialization example
//        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
//            Person deserializedPerson = (Person) ois.readObject();
//            // Use the deserialized object
//            System.out.println("Name: " + deserializedPerson.getName());
//            System.out.println("Age: " + deserializedPerson.getAge());
//        } catch (IOException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }


//        linkedhashmap
//        Map<String, Integer> counting = new LinkedHashMap<>();
//
//        counting.put("one", 1);
//        counting.put("two", 2);
        //counting.forEach((key, value) -> System.out.println(key + ": " + value));
//        for(Map.Entry<String,Integer> entries: counting.entrySet()){
//            System.out.println(entries.getKey() + " : " + entries.getValue());
//        }

       // Question 1:
       // Write an enhanced for loop to iterate over an array of integers named numbers
        // and print each element.

//        int[] num = {1,2,3,4,5,6,7,8};
//
//        for(int number : num){
//            System.out.println(number);
//        }

       // Given a List<String> named words, write an enhanced for loop
        // to iterate over the list and print each word.
//        List<String> classNames = Arrays.asList("Alex","Elizabeth","Suzana","Ammey");
//         for(String names :classNames ){
//             System.out.println(names);
//         }

        //Write an enhanced for loop to iterate over a Set<Double>
        // named doubleSet and calculate the sum of all elements
       //  List<Double> weight = Arrays.asList(111.36,44.74,356.56,33.34);
//         Double[] weight = {111.36,44.74,356.56,33.34};
//         for(double boys :weight ){
//             System.out.println(boys);
//         }

        //Question: Write a program that finds the maximum element
        // in an array of integers using an enhanced for loop. Print the maximum value.
        int[] numbers = {34,22,56,45,88,76,1,44,333};
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;



//        for(int value : numbers){
//            if(value < minValue){
//                minValue = value;
//            }
//        }
//        System.out.println(minValue);

        for(int value : numbers){
            if(value > maxValue ){
                maxValue = value;
            }
        }
        System.out.println(maxValue);

    }//end of main

}//end of class


