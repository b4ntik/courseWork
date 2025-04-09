public class Main {
    public static void main(String[] args) {
        //создаю новый список сотрудников
        EmployeeBook employeeBook = new EmployeeBook();
        //создаю новых сотрудников
        Employee employee1 = new Employee("Ivan", "Ivanov");
        Employee employee2 = new Employee("Petr", "Petrov");
        Employee employee3 = new Employee("Igor", "Igorev");

        //заношу сотрудников в список сотрудников с какой-то зарплатой
        employeeBook.addEmployee(employee1, 85000);

        //добавляю сотрудников в список
        employeeBook.addEmployee(employee2, 100000);
        employeeBook.addEmployee(employee3, 60000);
        System.out.println(employeeBook);

        //удаление сотрудника
       employeeBook.deleteEmployee(1);

        employeeBook.addEmployee(employee2, 120000);
        //список сотрудников
        System.out.println(employeeBook);

        //выводим существующего сотрудника
        System.out.println(employeeBook.getEmployee(2));
        //ищем несуществующего сотрудника
        System.out.println(employeeBook.getEmployee(10));
        //минимальная зарплата
        System.out.println(employeeBook.findMinSalary());
        //максимальная зарплата
        System.out.println(employeeBook.findMaxSalary());
        //средняя зарплата
        System.out.println(employeeBook.findAverageSalary());
        //общая зарплата
        System.out.println(employeeBook.findAllSalary());

        employee1.setSecondName("Petrov");

        System.out.println(employeeBook);
    }
}