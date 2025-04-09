public class Employee {
    private String firstName;
    private String secondName;
    private int salary;
    private String department;
    private int id;
    private int countId = 0;

    public Employee (String firstName, String secondName, int salary, String department, int id){
        this.firstName = firstName;
        this.secondName = secondName;
        this.salary = salary;
        this.department = department;
        this.id = id;
        countId++;
    }
    public String getFirstName(){ return firstName;}

    public void setFirstName(String firstName) {  this.firstName = firstName; }

    public int getSalary() { return salary; }

    public String getDepartment() { return department; }

    public int getId() { return id; }

    public String getSecondName(){
        return secondName;
    }


    //оставлю этот сеттер на случай изменения фамилии (свадьба, например)
    public void setSecondName(String secondName) { this.secondName = secondName; }

    //переопределяю для получения корректных Имени_Фамилии в строке
    @Override
    public String toString(){
        return "Сотрудник: "+ getFirstName() + " " + getSecondName() + " Отдел: "+ getDepartment()+ " Зарплата: "+ getSalary()+ " Id: " + getId();
    }
}
