package org.example;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Teacher frizzel = new Teacher(1,"Ms.Frizzel",500);
        Teacher neuton = new Teacher(2,"Mr.Neuton",700);
        Teacher greene = new Teacher(3,"Mrs.Greene",600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(frizzel);
        teacherList.add(neuton);
        teacherList.add(greene);


        Student toni = new Student(1,"Toni",4);
        Student sam = new Student(2,"Sam",12);
        Student sally = new Student(3,"Sally",5);
        List<Student> studentList = new ArrayList<>();

        studentList.add(toni);
        studentList.add(sam);
        studentList.add(sally);




        School ghs = new School(teacherList,studentList);

        Teacher megan = new Teacher(6,"Megan", 900);

        ghs.addTeacher(megan);


        toni.payFees(5000);
        sam.payFees(6000);
        System.out.println("GHS has earned $"+ ghs.getTotalMoneyEarned());

        System.out.println("----GHS has paid in salary----");

        frizzel.receiveSalary(frizzel.getSalary());
        System.out.println("GHS has spent $" + frizzel.getSalary() + " on salary to " + frizzel.getName()
                +" and now has $" + ghs.getTotalMoneyEarned());

        greene.receiveSalary(greene.getSalary());
        System.out.println("GHS has spent $" + greene.getSalary() + " on salary to " + greene.getName()
                +" and now has $" + ghs.getTotalMoneyEarned());

        neuton.receiveSalary(neuton.getSalary());
        System.out.println(neuton);

        System.out.println("----Student's paying fees----");

        System.out.println(sam);






    }
}