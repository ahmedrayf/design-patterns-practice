package abstractFactory;

public class PizzaFactory implements AbstractFactory{

    @Override
    public Pizza create(String type) {
        if (type.equals("MixCheese"))
            return new MixCheese();
        else if (type.equals("Touna"))
            return new Touna();
        else
            return null;
    }
}
