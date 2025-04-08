public class EmployeeBook {
    private String firstName;
    private String secondName;
    private Employee employee;
    private int salary;

    public EmployeeBook(Employee employee, int salary) {
        this.employee = employee;
        //this.secondName = secondName;
        this.salary = salary;
    }

    public boolean setEmployeeBook(Employee employee, int salary) {
        //поиск свободного места в массиве и добавление нового сотрудника с какой-то зарплатой

        return true;
    }
    public void deleteEmployee(int id){

        for (Employee employees : employee){
            if (id == employees[id] && employees != null){
                employees[id] = null;
            }
        }
    }
}

