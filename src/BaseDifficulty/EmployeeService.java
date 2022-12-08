package BaseDifficulty;
public class EmployeeService {
    Employee[] employee = new Employee[10];
public int findSumSalary(Employee[] employee) {
    int sum = 0;
    for (int i=0; i < employee.length; i++){
        sum += employee[i].getSalary();
    }
    return sum;
}

public Employee findMinSalary(Employee[] employee){
    int minSalary = 100000000;
    int j = 0;
    for (int i = 0; i < employee.length; i++) {
        if (employee[i].getSalary() < minSalary) {
            minSalary = employee[i].getSalary();
            j = i;
        }
    }
    return employee[j];
}

    public Employee findMaxSalary(Employee[] employee){
        int maxSalary = 1;
        int j = 0;
        for (int i= 0; i < employee.length; i++) {
            if (employee[i].getSalary() > maxSalary){
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
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].getSurName() + " " + employee[i].getName() + " " + employee[i].getPatronymic());
        }
    }
}

