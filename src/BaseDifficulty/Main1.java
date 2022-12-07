package BaseDifficulty;

public class Main1 {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService(); //создаём переменную employeeService

        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Кайсаров", "Сергей", "Андреевич", 1, 320000);
        employee[1] = new Employee("Стрельцов", "Семен", "Петрович", 2, 280000);
        employee[2] = new Employee("Бекназарова", "Матлюба", "Айратовна", 3, 280000);
        employee[3] = new Employee("Пак", "Олег", "Григорьевич", 4, 250000);
        employee[4] = new Employee("Кац", "Элеонора", "Львовна", 5, 190000);
        employee[5] = new Employee("Игнатьев", "Максим", "Александрович", 3, 195000);
        employee[6] = new Employee("Кайсаров", "Сергей", "Андреевич", 2, 220000);
        employee[7] = new Employee("Гареев", "Олег", "Григорьевич", 1, 190000);
        employee[8] = new Employee("Хасанов", "Рустам", "Андриянович", 3, 150000);
        employee[9] = new Employee("Белова", "Агнесса", "Сигизмундовна", 4, 170000);

        for (Employee i : employee){
             System.out.println(i);
        }
        System.out.println(employeeService.findSumSalary(employee));
    }
}