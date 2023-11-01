package ru.gb.hw5;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    private static void showStudentsInfo(Student[] students) {
        Arrays.stream(students).forEach(System.out::println);
    }

    private static Student[] topFiveStudentSearch(Student[] students) {
        return Arrays.stream(students)
                .filter(s -> s.getSpecialty().equals("Информатика"))
                .filter(s -> s.getAverageGrade() > 4.5)
                .sorted((o1, o2) -> Double.compare(o2.getAverageGrade(), o1.getAverageGrade()))
                .limit(5)
                .toArray(Student[]::new);
    }

    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student("Алексей", new ArrayList<Double>(Arrays.asList(5.0, 4.0, 4.0, 5.0, 3.0, 5.0, 4.0)), "Информатика"),
                new Student("Петр", new ArrayList<Double>(Arrays.asList(5.0, 3.0, 4.0, 5.0, 3.0, 3.0, 5.0)), "Экономика"),
                new Student("Андрей", new ArrayList<Double>(Arrays.asList(5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0)), "Информатика"),
                new Student("Вадим", new ArrayList<Double>(Arrays.asList(5.0, 4.0, 4.0, 5.0, 2.0, 5.0, 4.0)), "Механика"),
                new Student("Кирилл", new ArrayList<Double>(Arrays.asList(5.0, 3.0, 4.0, 5.0, 3.0, 3.0, 5.0)), "Бухгалтерия"),
                new Student("Сергей", new ArrayList<Double>(Arrays.asList(5.0, 3.0, 4.0, 5.0, 5.0, 5.0, 5.0)), "Информатика"),
                new Student("Олег", new ArrayList<Double>(Arrays.asList(5.0, 5.0, 4.0, 5.0, 4.0, 5.0, 4.0, 5.0)), "Информатика"),
                new Student("Владимир", new ArrayList<Double>(Arrays.asList(5.0, 2.0, 4.0, 5.0, 2.0, 3.0, 5.0)), "Информатика"),
                new Student("Фома", new ArrayList<Double>(Arrays.asList(5.0, 5.0, 4.0, 5.0, 5.0, 5.0, 5.0)), "Информатика"),
                new Student("Артем", new ArrayList<Double>(Arrays.asList(5.0, 4.0, 4.0, 5.0, 5.0, 3.0, 5.0, 5.0, 5.0)), "Информатика"),
                new Student("Иван", new ArrayList<Double>(Arrays.asList(5.0, 5.0, 4.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0)), "Информатика"),
                new Student("Гордей", new ArrayList<Double>(Arrays.asList(5.0, 5.0, 4.0, 4.0, 5.0, 5.0, 4.0, 5.0, 5.0)), "Информатика")
        };

        System.out.println("Исходные данные:");
        showStudentsInfo(students);
        Student[] result = topFiveStudentSearch(students);

        System.out.println("-----------------------------");
        System.out.println("Конечный результат:");
        showStudentsInfo(result);

    }

}
