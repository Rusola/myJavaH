package hwork;

public class TestEmployee {
    public static void main(String[] args) {

        QAEngineer myEngineer = new QAEngineer("Donna",100, "BestToBest", 50);
        // name of QA Engineer
        myEngineer.getName();
        System.out.printf("My salary is %f and my company is %s", myEngineer.getSalary(), myEngineer.getCompany());
        System.out.printf("My bonus is usually %f.", myEngineer.getBonus());
    }
}
