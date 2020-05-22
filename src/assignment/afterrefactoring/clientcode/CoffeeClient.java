package src.assignment.afterrefactoring.clientcode;

import src.assignment.afterrefactoring.AmericanoCoffee;
import src.assignment.afterrefactoring.CapuccinoCoffee;
import src.assignment.afterrefactoring.CoffeeTemplate;
import src.assignment.afterrefactoring.MochaCoffee;

public class CoffeeClient {

    public static void main(String[] args) {
        CoffeeTemplate coffeeType = new MochaCoffee();

        //using template method
        coffeeType.prepareCoffee();
        System.out.println("************");

        coffeeType = new CapuccinoCoffee();
        coffeeType.prepareCoffee();

        System.out.println("************");

        coffeeType = new AmericanoCoffee();
        coffeeType.prepareCoffee();
    }
}
