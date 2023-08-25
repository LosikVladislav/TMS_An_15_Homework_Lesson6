package com.teachmeskills.lesson6.part_2.model;

import java.util.Objects;

/**
 * Создать класс для описания студента нашей группы
 * Поля класса: имя, фамилия, номер паспорта, название группы
 * Переопределить в классе методы toSting, hashcode и equals
 * Создать несколько экземпляров класса с одним и тем же значением полей
 * и сравнить с помощью метода equals
 */
public class Client {

    public String name;
    public String address;
    public String passportNumber;
    public long clientId;

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                ", clientId=" + clientId +
                '}';
    }


}
