package src.assignment.afterrefactoring;

public class CapuccinoCoffee extends CoffeeTemplate {

    @Override
    protected void addIngredients() {
        System.out.println("Add hot milk");
        System.out.println("Add cinnamon");
    }

    @Override
    protected void finalTouch() {
        System.out.println("Top with milk foam");
    }
}
