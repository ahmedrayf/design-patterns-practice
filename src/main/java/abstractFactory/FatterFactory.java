package abstractFactory;

public class FatterFactory implements AbstractFactory{

    @Override
    public Fatter create(String type) {
        if (type.equals("Cheese"))
            return new Cheese();
        else if (type.equals("Honey"))
            return new Honey();
        else if (type.equals("Sausage"))
            return new Sausage();
        else
            return null;
    }
}
