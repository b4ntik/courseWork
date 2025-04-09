
public class EmployeeBook {

    private Employee[] employees;


    //создаю массивы сотрудников и зарплат из 5 элементов при вызове этого метода
    public EmployeeBook() {
        employees = new Employee[5];
    }

    //добавляю сотрудника
    public void addEmployee(Employee employee) {
        boolean added = false;
        for (int i = 0; i < employees.length; i++) {
            if ( employees[i] == null) {
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

        for (int i = 0; i < employees.length; i++) {
            if (employees[id] != null) {
                employees[id] = null;
            }
        }
    }

    //метод для поиска минимальной зарплаты
   /* public String findMinSalary() {

        if (count == 0 ) {
            return "Список зарплат пуст"; // Обработка пустого массива
        }
        int min = salaries[0];
        for (int i = 1; i < salaries.length; i++) {
            if (salaries[i]< min && salaries[i] != 0) {
                min = salaries[i];
            }

        }
        return "Минимальная зарплата в коллективе " + min;
    }
    //метод для поиска максимальной зарплаты
    public String findMaxSalary() {
        if (salaries == null || salaries.length == 0) {
            return "Список зарплат пуст"; // Обработка пустого массива
        }
        int max = salaries[0];
        for (int i = 1; i < salaries.length; i++) {
            if (salaries[i]> max && salaries[i] != 0) {
                max = salaries[i];
            }
        }
        return "Максимальная зарплата в коллективе " + max;
    }
    public String findAverageSalary() {
        if (salaries == null || salaries.length == 0) {
            return "Список зарплат пуст"; // Обработка пустого массива
        }
        int average = 0;
        int countSalary = 0;
        for (int i = 0; i < salaries.length; i++) {
            if (salaries[i] != 0) {
                average += salaries[i];
                countSalary++;
            }
        }
        return "Средняя зарплата в коллективе " + average/countSalary;
    }
    public String findAllSalary() {
        if (salaries == null || salaries.length == 0) {
            return "Список зарплат пуст"; // Обработка пустого массива
        }
        int salary = 0;

        for (int i = 0; i < salaries.length; i++) {
            if (salaries[i] != 0) {
                salary += salaries[i];

            }
        }
        return "Затраты на ФОП " + salary;
    }
*/
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




