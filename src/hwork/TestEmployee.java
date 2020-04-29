package hwork;

public class TestEmployee {
    public static void main(String[] args) {
        // name of QA Engineer
        QAEngineer myEngineer = new QAEngineer("Donna",100, "BestToBest", 50);
        myEngineer.getName();
        System.out.printf("My salary is %f and my company is %s", myEngineer.getSalary(), myEngineer.getCompany());
        System.out.printf("My bonus is usually %f.", myEngineer.getBonus());
    }
}
