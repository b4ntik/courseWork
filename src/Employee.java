public class Employee {
    private String firstName;
    private String secondName;

    public Employee (String firstName, String secondName){
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getEmployeeName() {
        return firstName, secondName;
    }

    public void setEmployeeName(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    //оставлю этот сеттер на случай изменения фамилии (свадьба, например)
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
}
