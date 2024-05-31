package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("one", "two", "three"));
    Applying applying = new Applying();
    System.out.println(filter(arrayList, applying));

  }
  public static ArrayList<String> filter(ArrayList<String> objects, Applying applying){
    ArrayList<String> str = new ArrayList<>();
    for (Object i : objects) {
      str.add(applying.apply(i).toString());
    }
    return str;
   }
}