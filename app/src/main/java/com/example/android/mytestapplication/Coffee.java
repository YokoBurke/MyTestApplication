package com.example.android.mytestapplication;

public class Coffee {

    int strength;
    String flavour;

    public Coffee (int myStrength, String myFlavour){
        flavour = myFlavour;
        strength = myStrength;
    }

    public String getFlavour(){
        return flavour;
    }
    public int getStrength(){
        return strength;
    }
}
