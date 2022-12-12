package BaseDifficulty;

import java.util.Arrays;

public class EmployeeService {
    Employee[] employee = new Employee[10];
public int findSumSalary(Employee[] employee) {
    int sum = 0;
    for (Employee value : employee) {
        if (value != null) {
            sum += value.getSalary();
        }
    }
    return sum;
}

public Employee findMinSalary(Employee[] employee){
    double minSalary = 100000000;
    int j = 0;
    for (int i = 0; i < employee.length; i++) {
        if (employee[i] != null && employee[i].getSalary() < minSalary) {
                minSalary = employee[i].getSalary();
                j = i;
        }
    }
    return employee[j];
}

    public Employee findMaxSalary(Employee[] employee){
        double maxSalary = 1;
        int j = 0;
        for (int i= 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getSalary() > maxSalary){
                maxSalary = employee[i].getSalary();
                j = i;
            }
        }
        return employee[j];
    }

    public int calculationAverageMonthlySalary(Employee[] employee){
        int averageMonthlySalary;
        averageMonthlySalary = findSumSalary(employee) / employee.length;
        return averageMonthlySalary;
    }

    public void printNameEmployee(Employee[] employee) {
        for (Employee value : employee) {
            if (value != null)
                System.out.println(value.getSurName() + " " + value.getName() + " " + value.getPatronymic());
        }
    }
    public void calculationIndexationSalary(Employee[] employee){
    double salary;
        for (Employee value : employee) {
            if (value != null) {
                salary = value.getSalary() * 1.05;       //Индесация ЗП на 5%
                value.setSalary(salary);
            }
        }
    }

    /*public Arrays findNumDepartment(Employee[] employee) {
        int[] num = new int[employee.length];
        int j = 0;
        int k = 0;
        for (int i = 1; i < employee.length - 1; i++) {
                if (employee[k].getDepartment() == i) {
                    num[j] = employee[k].getDepartment();
                    System.out.print("one: num[" + j + "] "+ num[j] + " ");
                    j++;
                    k++;
                    break;

                } else for (; k < employee.length - 1; k++) {
                    if (employee[k].getDepartment() == i) {
                        num[j] = employee[k].getDepartment();
                        System.out.print("num[" + j + "] =" + num[j] + " ");
                        j++;
                        break;
                    }
                }

        }
        //System.out.println(Arrays.toString(num[]));
        return num[];
    }*/
}

