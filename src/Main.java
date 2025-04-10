public class Main {
    public static void main(String[] args) {
        //создаю новый список сотрудников
        EmployeeBook employeeBook = new EmployeeBook();
        //создаю новых сотрудников
        Employee employee1 = new Employee("Ivan", "Ivanov", 85000, "Sale");
        Employee employee2 = new Employee("Petr", "Petrov", 60000, "HR");
        Employee employee3 = new Employee("Igor", "Igorev", 100000, "SalesManager");

        //заношу сотрудников в список сотрудников с какой-то зарплатой
        employeeBook.addEmployee(employee1);

        //добавляю сотрудников в список
        employeeBook.addEmployee(employee2);
        employeeBook.addEmployee(employee3);
        System.out.println(employeeBook);

        //удаление сотрудника
        employeeBook.deleteEmployee(1);

        //список сотрудников
        System.out.println(employeeBook);

        //выводим существующего сотрудника
        System.out.println(employeeBook.getEmployee(2));
        //ищем несуществующего сотрудника
        System.out.println(employeeBook.getEmployee(10));
        //минимальная зарплата
        System.out.println("Сотрудник с минимальной зарплатой: " + employeeBook.findMinSalary());
        //максимальная зарплата
        System.out.println("Сотрудник с максимальной зарплатой: " + employeeBook.findMaxSalary());
        //средняя зарплата
        System.out.println("Средняя зарплата в фирме: " + employeeBook.findAverageSalary());
        //общая зарплата
        System.out.println("Затраты на ФОП в фирме: " + employeeBook.findAllSalary());

        employee1.setSecondName("Petrov");

        System.out.println(employeeBook);


    }
}