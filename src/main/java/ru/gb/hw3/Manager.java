package ru.gb.hw3;

public class Manager extends Employee {

    public Manager(String name, String fatherName, String surName, String phone, String job, int salary, int dayBirtday, int monthBirthday, int yearBirthday) {
        super(name, fatherName, surName, phone, job, salary, dayBirtday, monthBirthday, yearBirthday);
    }


    public static void increaser(Employee[] array, int age, int amount) {
        if (!(array == null)) {
            for (Employee item : array
            ) {
                if (!(item instanceof Manager) && (item.getAge() > age)) {
                    item.increaseSalary(amount);
                }
            }
        }
    }

    public static void increaser(Employee[] array, int amount) {
        increaser(array, 0, amount);
    }

    public String info() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", surName='" + surName + '\'' +
                ", job='" + job + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", age=" + getAge() +
                '}';
    }
}
