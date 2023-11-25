package com.mygy.smartrecipes;

import java.io.Serializable;
import java.util.HashMap;

public class Reciepe implements Serializable {
    private String name;
    private String cookingTime;
    private String cookingSteps;
    private int btnImgRes, icoRes;
    private HashMap<Ingridient,String> ingridients;//ingridient : кол-во

    public Reciepe(String name, String cookingTime, int icoRes,int btnImgRes, HashMap<Ingridient, String> ingridients, String cookingSteps) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.icoRes = icoRes;
        this.btnImgRes = btnImgRes;
        this.ingridients = ingridients;
        this.cookingSteps = cookingSteps;
    }

    public String getName() {
        return name;
    }
    public int getBtnImgRes() {
        return btnImgRes;
    }

    public int getIcoRes() {
        return icoRes;
    }


    public String getCookingTime() {
        return cookingTime;
    }

    public String getCookingSteps() {
        return cookingSteps;
    }

    public HashMap<Ingridient, String> getIngridients() {
        return ingridients;
    }
}
