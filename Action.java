package com.company;

public class Action extends AbstractAction implements InterfaceChangePlace{
    private String name;
    private String info = "";
    private boolean isChangePlace;
    private Place place;

    public Action(String name, String info){
        this.name = name;
        this.info = info;
        this.isChangePlace = false;
        this.place = null;
    }

    public Action(String name, String info, boolean isChangePlace, Place place){
        this.name = name;
        this.info = info;
        this.isChangePlace = isChangePlace;
        this.place = place;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        o = (Action) o;
        return ((Action) o).getName().equals(this.name) && ((Action) o).getInfo().equals(this.info);
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return this.name + " " + (info == null ? "": this.info);
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (info != null ? info.hashCode() : 0);
        return result;
    }

    public String getInfo(){
        return this.info;
    }

    @Override
    public Place setPlace(Place place) {
        System.out.println("Положение персонажа было изменено на " + (place == Place.SKY ? "небо" : (place == Place.FLOOR ? "пол" : "стоя")));
        this.place = place;
        return place;
    }
}
