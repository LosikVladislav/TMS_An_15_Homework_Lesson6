package com.teachmeskills.lesson6.part_1.model.container;

/**
 * добавлен новый параметр price
 */
public class ShipСontainer {

    // Fields
    int width;
    int length;
    int depth;
    String containerModel;
    public int price;



    // Constructors
    public ShipСontainer() {
        System.out.println("без параметрами");
        this.width = 10;
        this.length = 20;
        this.depth = 30;
        this.containerModel = "Кастомный контейнер";
        this.price = (width+length+depth)*1000;
    }

    public ShipСontainer(int width, int length, int depth, int price) {
        System.out.println("с параметрами");
        this.width = width;
        this.length = length;
        this.depth = depth;
        this.containerModel = "Кастомный контейнер";
        this.price = (width+length+depth)*1000;
    }

    public ShipСontainer(int width, int length, int depth, int price, String boxModel) {
        this.width = width;
        this.length = length;
        this.depth = depth;
        this.containerModel = boxModel;
        this.price = (width+length+depth)*1000;
    }

}
