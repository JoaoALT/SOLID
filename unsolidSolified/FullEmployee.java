package unsolidSolified;

public class FullEmployee implements Employee{

    String department;
    String name;

    public FullEmployee(String department, String name) {
        this.department = department;
        this.name = name;
    }

    @Override
    public String getDepartment() {
        return department;
    }

    public String getName(){
        return name;
    }
}
