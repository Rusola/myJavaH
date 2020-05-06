package interfaces;

import interfaces.Drawable;

public class Circle implements Drawable {
    public void draw(){
        System.out.println("Drawing a circle");
    }

    public void drawWithRed(){
        System.out.println("Drawing with Red!");
    }
}
