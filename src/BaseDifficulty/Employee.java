package BaseDifficulty;
//import java.util.Objects;
public class Employee {
    private final int id;
    private static int count = 1;
    private final String surName;
    private String name;
    private String patronymic;
    private int department;
    private int salary;

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

    public int getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "табельный № " + id + " " + surName + " " + name + " " +
                patronymic + ", отдел- " + department + ", оклад= " + salary + "руб.";
    }

}
