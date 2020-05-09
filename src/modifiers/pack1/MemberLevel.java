package modifiers.pack1;

public class MemberLevel {
    private String privateLastName; // visible only in this class

    protected int age; // accessible in the same package & all subclasses
    String defaultCity; // accessible in the same package

    // constructor
    public MemberLevel(String privateLastName, int age, String defaultCity) {
        this.privateLastName = privateLastName;
        this.age = age;
        this.defaultCity = defaultCity;
    }

    private String getPrivateLastName() {
        return privateLastName;
    }

    protected int getProtectedAge() { // should be protected as works with protected?
        return age;
    }

    String getDefaultCity() {
         return defaultCity;
    }
}
