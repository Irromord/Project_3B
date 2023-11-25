package com.mygy.smartrecipes;

import java.io.Serializable;
import java.util.ArrayList;

public class Ingridient implements Serializable {

  public static ArrayList<Ingridient> allIngridients = new ArrayList<>();
  public static ArrayList<Ingridient> selectedIngridient = new ArrayList<>();
  private String name;

  public Ingridient(String name) {

    this.name = name;
    allIngridients.add(this);
  }

  public String getName() {
    return name;
  }
}
