package abstractFactory;

public class AbstractFactoryDriver {
    public static void main(String[] args) {
        AbstractFactory abstractFactory;
        abstractFactory = FactoryProvider.getFactory("Fatter");
        Fatter fatter = (Fatter) abstractFactory.create("Cheese");

        abstractFactory = FactoryProvider.getFactory("Pizza");
        Pizza pizza = (Pizza) abstractFactory.create("MixCheese");

        System.out.println("Fatter" + fatter.getType() + ", Pizza" + pizza.getType());
    }

}
