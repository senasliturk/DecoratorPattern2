package Tasarımmi2;

public class Beverage {

    public double cost() {
        double cost =0.0;
        if(hasMilk()){
            cost =+ 4.99;
        }
        else if (hasSoy()) {
            cost =+ 5.99;
        }
        else if(hasMocha()){
            cost =+ 6.99;
        } else if (hasWhip()) {
            cost =+ 7.99;
        }
        return cost;
    }
}
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = “Most Excellent Dark Roast”;
    }
    public double cost() {
        return 10.99+ super.cost();
    }
}