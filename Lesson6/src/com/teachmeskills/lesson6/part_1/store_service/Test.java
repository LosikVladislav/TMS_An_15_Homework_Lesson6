package com.teachmeskills.lesson6.part_1.store_service;

import com.teachmeskills.lesson6.part_1.store_service.model.container.PlanContainer;

public class Test {

    public static void main(String[] args) {
        System.out.println("Start");

        PlanContainer container1 = new PlanContainer(10, 100, 100);
        PlanContainer container2 = new PlanContainer();
        PlanContainer container3 = new PlanContainer(34);

        container2.showConrainerMesssage();
        container2.showConrainerMesssage(3);
        String str = container3.getMessage();

        System.out.println(str);

        String str2 = getMessageInTest();
        System.out.println(str2);

    }

    public static String getMessageInTest(){
        return "THIS IS SPARTAaaaaaa";
    }

}
