package com.teachmeskills.lesson6.part_3;

import com.teachmeskills.lesson6.part_3.model.Student;

public class Run {
    public static void main(String[] args) {

        Student studentFirst = new Student();
        studentFirst.studentId = 1;
        studentFirst.name = "Denis";
        studentFirst.surname = "Korzun";
        studentFirst.passportNum = "134456A4AM4";
        studentFirst.groupNum = 1;

        Student studentSecond = new Student();
        studentSecond.studentId = 2;
        studentSecond.name = "Vladislav";
        studentSecond.surname = "Losik";
        studentSecond.passportNum = "123456A4PB4";
        studentSecond.groupNum = 1;

        Student studentThird = new Student();
        studentThird.studentId = 1;
        studentThird.name = "Roman";
        studentThird.surname = "Belov";
        studentThird.passportNum = "1789646A4PB6";
        studentThird.groupNum = 1;

        Student studentFourth = new Student();
        studentFourth.studentId = 2;
        studentFourth.name = "Vladislav";
        studentFourth.surname = "Losik";
        studentFourth.passportNum = "123456A4PB4";
        studentFourth.groupNum = 1;

        String strFirst = studentFirst.toString();
        String strSecond = studentSecond.toString();
        String strThird = studentThird.toString();
        String strFourth = studentFourth.toString();
        System.out.print(strFirst + "\n" + strSecond + "\n" + strThird + "\n" + strFourth + "\n" );

        System.out.println("second student hashCode " + studentSecond.hashCode());

        if(studentSecond.equals(studentFourth)){
            System.out.println("they are the same");
            System.out.println(studentSecond.hashCode());
            System.out.println(studentFourth.hashCode());
        }else{
            System.out.println("they are not the same");
        }
    }
}
