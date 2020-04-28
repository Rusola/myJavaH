package inheritance;

public class Animal {
    private  String type;

    // constructor
    public Animal(String aType){
        type = aType;
    }

    // methods
    public void eat() {
        System.out.println("Eating ...");
    }

    // getters & setters
    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

}
