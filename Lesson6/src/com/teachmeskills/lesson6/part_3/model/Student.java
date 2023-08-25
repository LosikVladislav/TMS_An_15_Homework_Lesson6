package com.teachmeskills.lesson6.part_3.model;

import java.util.Objects;

public class Student {
    public  int studentId;
    public String name;
    public String surname;
    public String passportNum;
    public int groupNum;

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", passportNum='" + passportNum + '\'' +
                ", groupNum=" + groupNum +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId && groupNum == student.groupNum && Objects.equals(name, student.name) && Objects.equals(surname, student.surname) && Objects.equals(passportNum, student.passportNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, name, surname, passportNum, groupNum);
    }
}
