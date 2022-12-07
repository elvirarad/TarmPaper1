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

}
