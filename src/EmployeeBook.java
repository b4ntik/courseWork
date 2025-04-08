public class EmployeeBook {
    private String firstName;
    private String secondName;
    private int salary;

    public EmployeeBook(String firstName, String secondName, int salary) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.salary = salary;
    }

    public boolean setEmployeeBook(String firstName, String secondName, int salary) {
        //поиск свободного места в массиве и добавление нового сотрудника

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

