package org.example;



public class Applying implements Filter {

  @Override
  public Object apply(Object o) {
    return String.valueOf(o).toUpperCase();
  }
}
