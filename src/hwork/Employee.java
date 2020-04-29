package hwork;

public class Employee extends Person{
    private double salary;
    private String company;

    // constructor
    public Employee(String aName, double aSalary, String aCompany){
        super(aName);
        salary  = aSalary;
        company = aCompany;
    }

    public double getSalary(){
        return salary;
    }

    public String getCompany(){
        return company;
    }
}
