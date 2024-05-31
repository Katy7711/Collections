package org.example;



public class Apply implements Filter {

  @Override
  public Object apply(Object o) {
    return String.valueOf(o).toUpperCase();
  }
}
