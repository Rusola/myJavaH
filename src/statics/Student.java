package statics;

public class Student {

    // instance variable (unique for each obj)
    private String name;
    private String city;

    // class level variable
    private static String school = "TheirSchool";
    private static int numberOfStudents = 0;

    // constructor
    public Student(String aName, String aCity){
        name = aName;
        city = aCity;
        numberOfStudents++; // при создании нового obj будет счетчик увеличиваться
    }

    // getters
    public static String getSchool(){ // ant method working with static variable should have static in the method signature too
        return school;
    }

    public static int getNumberOfStudents(){
        return  numberOfStudents;
    }
}
