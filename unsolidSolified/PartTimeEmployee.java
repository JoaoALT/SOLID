package unsolidSolified;

public class PartTimeEmployee implements Employee{

    String department;

    public PartTimeEmployee(String department) {
        this.department = department;
    }

    @Override
    public String getDepartment() {

        return department;
    }

}

