package com.mygy.smartrecipes;

import java.io.Serializable;
import java.util.ArrayList;

public class Category implements Serializable {
    private String name;
    private int btnImageRes;
    private ArrayList<Reciepe> resiepes = new ArrayList<>();

    public Category(String name, int btnImageRes) {
        this.name = name;
        this.btnImageRes = btnImageRes;
    }

    public String getName() {
        return name;
    }

    public int getBtnImageRes() {
        return btnImageRes;
    }

    public ArrayList<Reciepe> getResiepes() {
        return resiepes;
    }

    public void addReciepe(Reciepe reciepe){
        resiepes.add(reciepe);
    }
}
