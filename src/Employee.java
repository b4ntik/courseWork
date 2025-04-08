public class Employee {
    private String firstName;
    private String secondName;

    public Employee (String firstName, String secondName){
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFirstNameName() {
        return firstName;
    }
    public String getSecondName(){
        return secondName;
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
