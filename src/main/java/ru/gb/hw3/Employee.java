package ru.gb.hw3;

import java.time.LocalDate;

public class Employee {
    protected String name;
    protected String fatherName;
    protected String surName;

    protected String phone;

    protected String job;

    protected int salary;
    protected int dayBirtday;
    protected int monthBirthday;
    protected int yearBirthday;

    public Employee(String name, String fatherName, String surName, String phone, String job, int salary, int dayBirtday, int monthBirthday, int yearBirthday) {
        this.name = name;
        this.fatherName = fatherName;
        this.surName = surName;
        this.phone = phone;
        this.job = job;
        this.salary = salary;
        this.dayBirtday = dayBirtday;
        this.monthBirthday = monthBirthday;
        this.yearBirthday = yearBirthday;
    }

    public int getAge() {
        return LocalDate.now().getYear() - yearBirthday;
    }

    public int getSalary() {
        return salary;
    }

    public int getDayBirtday() {
        return dayBirtday;
    }

    public int getMonthBirthday() {
        return monthBirthday;
    }

    public int getYearBirthday() {
        return yearBirthday;
    }

    protected void increaseSalary(int amount) {
        salary += amount;
    }

    public String info() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", surName='" + surName + '\'' +
                ", job='" + job + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", age=" + getAge() +
                '}';
    }

    public String compareDateBirthday(Employee emp){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Дата рождения первого сотрудника %d-%02d-%02d", this.getYearBirthday(), this.getMonthBirthday(), this.getDayBirtday()));
        sb.append("\n");
        sb.append(String.format("Дата рождения второго сотрудника %d-%02d-%02d", emp.getYearBirthday(), emp.getMonthBirthday(), emp.getDayBirtday()));
        sb.append("\n");
        sb.append("Результат сравнения: " + Employee.getCompareResult(this.compareTo(emp.getDayBirtday(),emp.getMonthBirthday(),emp.getYearBirthday())));
        sb.append("\n");
        return sb.toString();
    }

    private int compareTo(int day, int month, int year) {
        int employeeDate = dayBirtday + monthBirthday * 100 + yearBirthday * 10000;
        int inputDate = day + month * 100 + year * 10000;
        return employeeDate - inputDate;
    }

    private static String getCompareResult(int value) {
        if (value > 0) {
            return "Первая дата больше второй";
        } else if (value == 0) {
            return "Даты равны";
        } else {
            return "Вторая дата больше первой";
        }
    }

    private static void print(String text) {
        System.out.println(text);
    }



    public static void printEmloyees(Employee[] array) {
        for (int i = 0; i < array.length; i++) {
            print(array[i].info());
        }
    }

    public static float getAverageAge(Employee[] array) {
        float sumAge = 0f;
        if (array != null || array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                sumAge += array[i].getAge();
            }
            return sumAge / array.length;
        } else return sumAge;
    }

    public static float getAverageSalary(Employee[] array) {
        float sumSalary = 0f;
        if (array != null || array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                sumSalary += array[i].getSalary();
            }
            return sumSalary / array.length;
        } else return sumSalary;
    }


}
