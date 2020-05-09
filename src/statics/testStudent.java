package statics;

public class testStudent {
    public static void main(String[] args) {
        Student s1 = new Student("David", "Moscow");
        Student s2 = new Student("Dasha", "NY");

        // no need to create an obj, use class name instead
        System.out.printf("School name is: '%s'", Student.getSchool());
        System.out.println(); // easy to look
        System.out.println(Student.getNumberOfStudents());

    }
}
