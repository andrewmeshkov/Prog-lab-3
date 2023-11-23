package com.company;

import java.util.ArrayList;

abstract class AbstractCharacter implements InterfaceCharacter{
    public String name;
    public Place place;

    public AbstractCharacter(){

    }

    public AbstractCharacter(String name){
        this.name = name;
    }

    public AbstractCharacter(String name, Place place){
        this.name = name;
        this.place = place;
    }

    public String getName(){
        return name;
    }
}
