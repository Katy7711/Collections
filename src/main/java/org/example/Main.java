package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {

  public static void main(String[] args) {
    ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("one", "two", "three"));
    Applying applying = new Applying();
    System.out.println(filter(arrayList, applying));
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,2,3,3,3,4,4,4,4));
    System.out.println(elements(numbers));



  }
  public static ArrayList<String> filter(ArrayList<String> objects, Applying applying){
    ArrayList<String> str = new ArrayList<>();
    for (Object i : objects) {
      str.add(applying.apply(i).toString());
    }
    return str;
   }

   public static Map<Integer, Integer> elements (ArrayList<Integer> objects){
     Map<Integer, Integer> elements = new HashMap<>();
     for (Integer i : objects) {
       int count = Collections.frequency(objects, i);
       elements.put(i, count);
     }
     return elements;
   }
}