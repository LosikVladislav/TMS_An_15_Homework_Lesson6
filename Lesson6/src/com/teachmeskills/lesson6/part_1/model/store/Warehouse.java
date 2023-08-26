package com.teachmeskills.lesson6.part_1.model.store;

import com.teachmeskills.lesson6.part_1.model.container.ShipСontainer;

import java.util.Arrays;

public class Warehouse {

    // Fields
    public String address;
    public ShipСontainer[] containers;


    // Constructors
    public Warehouse() {
        this.address = "Amsterdam";
    }

    // добавить конструктов только с одним параметром - address
    public Warehouse(String address){
        this.address = address;
    }

    public Warehouse(String address, ShipСontainer[] containers) {
        this.address = address;
        this.containers = containers;
    }

    // Methods
    public void setContainers(ShipСontainer[] containers){

        this.containers = containers;

    }

    // TODO #done
    // добавить метод добаваления новых контейнов в уже сущесвующий массив контейнеров
    public void addContainers(ShipСontainer[] containers){
        int inputContainerSize = containers.length;
        int currentContainerSize = this.containers.length;


        // Checking available space inside our container;
        int availableSpace = currentContainerSize - getElementsCount();


        // Counting elements inside provided container;
        int elementsToAdd = 0;
        for (int i = 0; i < inputContainerSize; i++) {
            if (containers[i] != null) elementsToAdd++;
            else break;
        }

        if (elementsToAdd < availableSpace) {
            System.out.println("There is not enough space inside our container");
        }else {
            for (int i = 0; i < elementsToAdd; i++) {
                this.containers[getElementsCount()-1] = containers[i];
            }
            System.out.println("Container successfully changed");
        }
    }

    // TODO
    // добавить метод для вывода стоимости всех контейнеров
    // возвращаемый тип данных - число с плавающей точкой
    public double getSumPrice() {
        double sum = 0;
        for (int i = 0; i < this.containers.length; i++) {
            sum = sum + this.containers[i].price;
        }
        return sum;
    }


    private int getElementsCount(){
        int i;
        for (i = 0; i < this.containers.length; i++) {
            if (containers[i] == null)  return i;
        }
        return i;
    }

}
