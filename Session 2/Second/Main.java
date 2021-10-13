package com.company;

public class Main {


    public static void main(String[] args) {
        Lab lab = new Lab(10, "1400/7/18");
        Student std1 = new Student("Moein", "Ahmadieh", "9931001");
        Student std2 = new Student("Matin", "Ahmadeih", "9931002");
        Student std3 = new Student("Parisa", "Ahmadieh", "9931003");
        Student std4 = new Student("Ebrahim", "Ahmadieh", "9931004");
        Student std5 = new Student("Parvin", "Kazemi", "9931005");
        std1.setGrade(20);
        std2.setGrade(18);
        std3.setGrade(19);
        std4.setGrade(17);
        std5.setGrade(20);
        lab.enrollStudent(std1);
        lab.enrollStudent(std2);
        lab.enrollStudent(std3);
        lab.enrollStudent(std4);
        lab.enrollStudent(std5);
        lab.calculateAvg();
        lab.print();
        System.out.println("class average is " + lab.getAvg());
        System.out.println("class date is " + lab.getDay());
        System.out.println("class capacity is " + lab.getCapacity());
    }
}
