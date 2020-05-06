package inheritance;

import inheritance.Animal;

public class Dog  extends Animal {
    private String name;
    private String bread;

    // constructor
    public Dog(String aType, String aName, String aBread){
        // 1st we need to create an object of super class
        super(aType);// констрактор супер класса вызывается словом super
        // then add unique dog fields
        name = aName;
        bread = aBread;

    }
}
