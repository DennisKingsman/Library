package decorator;

public class DecoratorMain {

    public static void main(String[] args) {
        // The PlainPizza object is sent to the Mozzarella constructor
        // and then to the TomatoSauce constructor
        Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));
        System.out.println("Ingredients: " + basicPizza.getDescription());
        System.out.println("Price: " + basicPizza.getCost());

        //Same by steps
        Pizza basic = new PlainPizza();
        basic = new Mozzarella(basic);
        basic = new TomatoSauce(basic);
        System.out.println("Ingredients: " + basic.getDescription());
        System.out.println("Price: " + basic.getCost());
    }

}
