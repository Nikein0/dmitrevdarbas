package org.example;
import students.model.Account;
import students.model.Student;
import students.model.Subject;

import java.lang.Math;
import java.util.*;

public class Main {

    public static void main(String... args) {
        /*
        char charTest = 127;

        byte byteTest = -128;
        short shortTest = 32767;
        int intTest = 123123123;
        long longTest = 1111111111;
        float floatTest = 13.12311111f;
        double doubleTest = 10;
        boolean booleanTest = true;
        //System.out.println(floatTest);
        char StudentRepositoryint;
        double[] Array;
        Array = new double[20];

        for (int i = 0; i < 20; i++) {
            Array[i] = Math.random();
        }
        for (int i = 0; i < 20; i++){
            System.out.println(Array[i]);
        }
        System.out.println("Second array: ");
        int[] intArray;
        intArray = new int[20];

        for (int i = 0; i < 20; i++){
            intArray[i] = (int)(Math.random()*10);
        }
        for (int i = 0; i < 20; i++)
        {
            System.out.println(intArray[i]);
        }

        List<Integer> myList = new ArrayList<>();

        myList.add(1);
        myList.add(2);
        myList.add(3);

        for(int i  =0; i < myList.size(); i++){
            System.out.println("Index " + i + " Element " + myList.get(i));
        } //nera patogi

        for(int value : myList) //foreach loop
        {
            System.out.println("Element at index " + myList.indexOf(value) + " Is " + value);
        } //patogi

        List<Integer> myRandomList = new ArrayList<>();
        Random rand = new Random(100);

        for (int i = 0; i < 20; i++)
        {
            myRandomList.add(rand.nextInt(100));
        }

        for (int value : myRandomList){
            System.out.println(" Index " + myRandomList.indexOf(value) + " Element " + value);
        }

        List<String> myStringList = new ArrayList<>();
        myStringList.add("x");
        myStringList.add("a");
        myStringList.add("b");
        myStringList.add("c");
        myStringList.add("a");

        for (String letter : myStringList){
            System.out.println(letter);
        }

        Set<String> stringSet = new HashSet<>(myStringList); //Setas neturi pasikartojanciu reiksmiu
        System.out.println("String list size = " +  myStringList.size());
        System.out.println("String set size = " +  stringSet.size());

        for (String value : stringSet){
            System.out.println(value);
        }

        Map<Integer, String> myStringMap = new HashMap<>(); //Custom indexas ir value
        myStringMap.put(1, "A");
        myStringMap.put(2, "B");
        myStringMap.put(3, "C");

        for (String value : myStringMap.values()) {
            System.out.println(value);
        }

        Map<String, Float> myCustomStringMap = new HashMap<>();
        myCustomStringMap.put("A", 1.39f);
        myCustomStringMap.put("B", 133.199999f);
        myCustomStringMap.put("C", 0.29123f);

        for (Float value : myCustomStringMap.values()){
            System.out.println("Value = " + value);
        }

        for(String value : myCustomStringMap.keySet()){
            System.out.println(value + " -> " + myCustomStringMap.get(value) );
        }

        Iterator iter = myCustomStringMap.entrySet().iterator();
        while(iter.hasNext()){
            Object obj = iter.next();
            System.out.println(((Map.Entry<String, Float>)obj).getKey());
        }
        */

        Account account1 = new Account(1, "user1", "password");
        Subject subject1 = new Subject(1, "TestSubject", 5);
        Student student1 = new Student(1, "Vardenis", "Pavardenis",
                "1525", account1, List.of.subject1);


    }
}