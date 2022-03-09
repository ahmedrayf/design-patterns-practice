package abstractFactory;

public class FactoryProvider {
    public static AbstractFactory getFactory(String choice){

        if(choice.equalsIgnoreCase("Fatter")){
            return new FatterFactory();
        }
        else if(choice.equalsIgnoreCase("Pizza")){
            return new PizzaFactory();
        }
        return null;
    }
}
