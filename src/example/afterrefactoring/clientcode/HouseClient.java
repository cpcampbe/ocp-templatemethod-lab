package src.example.afterrefactoring.clientcode;

import src.example.afterrefactoring.ConcreteHouse;
import src.example.afterrefactoring.GlassHouse;
import src.example.afterrefactoring.HouseTemplate;
import src.example.afterrefactoring.WoodenHouse;

public class HouseClient {

    public static void main(String[] args) {
        HouseTemplate houseType = new WoodenHouse();

        //using template method
        houseType.buildHouse();
        System.out.println("************");

        houseType = new GlassHouse();
        houseType.buildHouse();

        System.out.println("************");

        houseType = new ConcreteHouse();
        houseType.buildHouse();
    }
}
