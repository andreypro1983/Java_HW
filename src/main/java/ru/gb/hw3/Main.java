package ru.gb.hw3;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = {
                new Employee("Ivan", "Igorevich",
                        "Ovchinnikov", "8(495)000-11-22",
                        "developer", 50000, 10, 5, 1985),
                new Employee("Andrey", "Viktorovich",
                        "Bezrukov", "8(495)111-22-33",
                        "fitter", 52000, 3, 12, 1973),
                new Employee("Evgeniy", "Viktorovich",
                        "Delfinov", "8(495)222-33-44",
                        "project manager", 40000, 8, 3, 1963),
                new Employee("Natalia", "Pavlovna",
                        "Keks", "8(495)333-44-55",
                        "senior developer", 90000, 2, 9, 1990),
                new Employee("Tatiana", "Sergeevna",
                        "Krasotkina", "8(495)444-55-66",
                        "accountant", 50031, 30, 6, 1983),
                new Manager("Petr", "Leonidovich",
                        "Slepakov", "8(495)440-51-12",
                        "seo", 150000, 12, 12, 1977)
        };



// увеличение зп для сотрудников старше 45 лет на 5000
//        Employee.increaser(employees, 45, 5000);
//        System.out.println("---------------------");
//        Employee.printEmloyees(employees);

// методы вывода среднего значения возвраста и зарплаты
//        System.out.println(Employee.getAverageAge(employees));
//        System.out.println(Employee.getAverageSalary(employees));

        System.out.println("---------------------");
//  прототип компаратора - метод внутри класса сотрудник для сравнения дат и метод вывода сообщения пользователю по итогам сравнения.
        System.out.println("Задание 1");
        System.out.println(employees[3].compareDateBirthday(employees[1]));
//        System.out.format("Дата рождения первого сотрудника %d-%02d-%02d\n", employees[3].getYearBirthday(), employees[3].getMonthBirthday(), employees[3].getDayBirtday());
//        System.out.format("Дата рождения второго сотрудника %d-%02d-%02d\n", employees[1].getYearBirthday(), employees[1].getMonthBirthday(), employees[1].getDayBirtday());
//
//        int compareDateResult = employees[3].compareTo(employees[1].getDayBirtday(), employees[1].getMonthBirthday(), employees[1].getYearBirthday());
//        System.out.println("Результат сравнения: " + Employee.getCompareResult(compareDateResult));

// Опишите класс руководителя, наследник от сотрудника. Перенесите статический метод повышения зарплаты в класс руководителя, модифицируйте метод таким образом, чтобы он мог поднять заработную плату всем, кроме руководителей. В основной программе создайте руководителя и поместите его в общий массив сотрудников. Повысьте зарплату всем сотрудникам и проследите, чтобы зарплата руководителя не повысилась.
        System.out.println("---------------------");
        System.out.println("Задание 2");
        Employee.printEmloyees(employees);
        System.out.println("---------------------");
        System.out.println("Увеличим зарплату всех сотрудников (кроме руководителей) на 3000");
        System.out.println("---------------------");
        Manager.increaser(employees, 3000);
        Employee.printEmloyees(employees);
    }
}
