package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("one", "two", "three"));
    Apply apply = new Apply();
    System.out.println(filter(arrayList, apply));

  }
  public static ArrayList<String> filter(ArrayList<String> objects, Apply apply){
    ArrayList<String> str = new ArrayList<>();
    for (Object i : objects) {
      str.add(apply.apply(i).toString());
    }
    return str;
   }
}