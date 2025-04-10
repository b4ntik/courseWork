
public class EmployeeBook {

    private Employee[] employees;


    //создаю массивы сотрудников и зарплат из 5 элементов при вызове этого метода
    public EmployeeBook() {
        employees = new Employee[5];
    }

    //добавляю сотрудника - переделал на цикл
    public void addEmployee(Employee employee) {
        boolean added = false;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                added = true;
                break;
            }
        }
        if (!added) {
            System.out.println("Нет свободных мест для добавления сотрудника.");
        }
    }

    public void deleteEmployee(int id) {

        for (Employee employee : employees) {
            if (employee != null && employee.getId() == id) {
                employees[id] = null;
            }
        }
    }

    //метод для поиска минимальной зарплаты
    public Employee findMinSalary() {

        Employee minSalary = employees[0];
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < minSalary.getSalary()) {
                minSalary = employee;
            }
        }
        return minSalary;
    }

    //метод для поиска максимальной зарплаты
    public Employee findMaxSalary() {

        Employee maxSalary = employees[0];
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > maxSalary.getSalary()) {
                maxSalary = employee;
            }
        }
        return maxSalary;
    }

    public int findAverageSalary() {
        int salary = 0;
        int countSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                salary += employee.getSalary();
                countSalary++;
            }
        }
        return salary / countSalary;
    }

    public int findAllSalary() {

        int allSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                allSalary += employee.getSalary();

            }
        }
        return allSalary;
    }


    public String getEmployee(int id) {
        StringBuilder getEmployee = new StringBuilder();
        if (id >= 0 && id < employees.length) {
            if (employees[id] != null) {
                getEmployee.append(employees[id]);
                return getEmployee.toString();
            }
        }
        return "Такого сотрудника нет";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Список сотрудников: \n");
        for (int i = 0; i < employees.length; i++) {
            sb.append(employees[i]).append("\n");
        }
        return sb.toString();
    }
}




