package com.company;

public class Main {

    public static void main(String[] args) {
        Character karlson = new Character("Карлсон");
        karlson.addAction(new Action("Улетел", null, true, Place.SKY));

        Character bimbo = new Character("Бимбо");
        bimbo.addAction(new Action("Лег", "на пол", true, Place.FLOOR));
        bimbo.addAction(new Action("Устачать хвостом", "по полу", true, Place.FLOOR));

        Character malish = new Character("Малыш");
        malish.addAction(new Action("Лег", "на пол", true, Place.FLOOR));

        bimbo.addAction(new Action("Вскочил", "", true, Place.STAND));
        bimbo.addAction(new Action("Затявкал", "от удовольствия"));
        bimbo.addAction(new Action("Уткнулся", "в плечо малыша"));

    }
}
