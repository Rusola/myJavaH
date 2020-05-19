package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class MyIntern {

    private String name;
    private double power;

    private double percent;

    private double min;
    private double max;

    public MyIntern(String aName, int aPower){
        name = aName;
        power = aPower;
    }

    public String getName() {
        return name;
    }

    public double getPower() {
        return power;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public double getPercent() {
        return percent;
    }
    public double getMin() {
        return min;
    }

    public double getMax() {
        return max;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public void setMax(double max) {
        this.max = max;
    }
}
