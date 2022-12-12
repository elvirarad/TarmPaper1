package BaseDifficulty;

import java.util.Objects;

public class Employee {
    private final int id;
    private static int count = 1;
    private  String surName;
    private final String name;
    private final String patronymic;
    private int department;
    private double salary;

    public Employee(String surName, String name, String patronymic, int department, int salary) {
        this.surName = surName;
        this.name = name;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
        this.id = count++;
    }

    public String getSurName() {
        return surName;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "табельный № " + id + " " + surName + " " + name + " " +
                patronymic + ", отдел- " + department + ", зар.плата = " + salary + " руб.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && salary == employee.salary && Objects.equals(surName, employee.surName) && Objects.equals(name, employee.name) && Objects.equals(patronymic, employee.patronymic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surName, name, patronymic, department, salary);
    }
}
