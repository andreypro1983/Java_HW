package ru.gb.hw5;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Student {
    private String name;
    private List<Double> grades;
    private String specialty;

    public Student(String name, List<Double> grades, String specialty) {
        this.name = name;
        this.grades = grades;
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public double getAverageGrade() {
        DoubleSummaryStatistics result = grades.stream()
                .collect(Collectors.summarizingDouble(aDouble -> aDouble.doubleValue()));
        return result.getAverage();

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", avgGrades=" + getAverageGrade() +
                ", specialty='" + specialty + '\'' +
                '}';
    }


}
