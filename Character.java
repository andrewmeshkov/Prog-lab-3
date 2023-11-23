package com.company;

import java.util.ArrayList;


public class Character extends AbstractCharacter{
    private String name;
    private Place place;
    private ArrayList<Action> actions;


    public Character(String name){
        this.name = name;
        this.place = null;
        this.actions = new ArrayList<Action>();
        System.out.println("Создан персонаж " + name);
    }

    public Character(String name, Place place){
        this.name = name;
        this.place = place;
        this.actions = new ArrayList<Action>();
        System.out.println("Создан персонаж " + name);
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public ArrayList<Action> getActions() {
        return actions;
    }

    public void setActions(ArrayList<Action> actions){
        this.actions = actions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean addAction(Action action){
        if(this.actions.add(action)) {
            System.out.println("Персонажу " + this.name + " добавлено действие " + action.toString());
            return true;
        }
        else{
            System.out.println("Произошла ошибка :(");
            return false;
        }
    }

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode();
    }
    @Override
    public int hashCode() {
        return super.hashCode() + this.getName().hashCode();
    }
}
