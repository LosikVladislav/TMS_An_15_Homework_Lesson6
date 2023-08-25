package com.teachmeskills.lesson6.part_2;

import com.teachmeskills.lesson6.part_2.model.Client;

public class Runner {

    public static void main(String[] args) {
        System.out.println("Start");

        int i = 10;
        int j = 10;

        Client client1 = new Client();
        client1.clientId = 1;
        client1.name = "Andrew";
        client1.address = "Minsk";
        client1.passportNumber = "123";

        Client client3 = new Client();
        client3.clientId = 1;
        client3.name = "Andrew";
        client3.address = "Minsk";
        client3.passportNumber = "123";

        Client client2 = new Client();
        client2.clientId = 2;
        client2.name = "Dovlet";
        client2.address = "Ashgabat";


        String str = client1.toString();
        System.out.println(str);

        System.out.println(client1.getClass());

        System.out.println(client1.hashCode());
        System.out.println(client2.hashCode());

        if(i==j){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        if(client1.equals(client3)){
            System.out.println("Yes");
            System.out.println(client1.hashCode());
            System.out.println(client3.hashCode());
        } else {
            System.out.println("No");
        }


        System.out.println("End");
    }

}
