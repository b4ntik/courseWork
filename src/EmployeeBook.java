
public class EmployeeBook {

    private Employee[] employees;
    private int count;
    private int[] salaries;

    //создаю массивы сотрудников и зарплат из 5 элементов при вызове этого метода
    public EmployeeBook() {
        employees = new Employee[5];
        salaries = new int[5];
        count = 0;
    }

    //добавляю сотрудника
    public void addEmployee(Employee employee, int salary) {


            if (count < employees.length && employees[count] == null) {

                employees[count] = employee;
                salaries[count] = salary;
                count++;

            } else {
                System.out.println("Нет свободных мест для добавления сотрудника.");
            }
        }


    public void deleteEmployee(int id) {

        for (Employee employee : employees) {
            if (employees[id] != null) {
                employees[id] = null;
                salaries[id] = 0;
            }
        }
    }
    //метод для поиска минимальной зарплаты
    public String findMinSalary() {

        if (salaries == null || salaries.length == 0) {
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

    public String getEmployee(int id) {
        StringBuilder getEmployee = new StringBuilder();
        if (id >= 0 && id < employees.length) {
            if (employees[id] != null) {
                getEmployee.append("Employee: ").append(employees[id]);
                return getEmployee.toString();
            }
        }
        return "Такого сотрудника нет";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("EmployeeBook: \n");
        for (int i = 0; i < count; i++) {
            sb.append("Employee: ").append(employees[i]).append(", Salary: ").append(salaries[i]).append("\n");
        }
        return sb.toString();
    }
}




