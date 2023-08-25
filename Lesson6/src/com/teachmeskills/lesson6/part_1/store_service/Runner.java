package com.teachmeskills.lesson6.part_1.store_service;

import com.teachmeskills.lesson6.part_1.store_service.model.container.ShipСontainer;
import com.teachmeskills.lesson6.part_1.store_service.model.store.Warehouse;

public class Runner {

    public static void main(String[] args) {
        System.out.println("Start");

        Warehouse warehouse1 = new Warehouse();

        ShipСontainer container1 = new ShipСontainer();
        ShipСontainer container2 = new ShipСontainer();
        ShipСontainer container3 = new ShipСontainer();
       // ShipСontainer container4 = new ShipСontainer();


        ShipСontainer[] containers = new ShipСontainer[5];
        containers[0] = container1;
        containers[1] = container2;
        containers[2] = container3;
       // containers[3] = container4;

        warehouse1.setContainers(containers);
        warehouse1.addContainers(containers);

        System.out.println("End");
    }

}
