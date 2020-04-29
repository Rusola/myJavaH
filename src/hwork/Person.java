package hwork;

public class Person {
    private String name;

    // constructor
    public Person(String name){
        this.name = name;
    }

    public void getName(){
        System.out.printf("My name is %s.", name);
    }
}
