package factory;

public class FatterFactory {
    public static Fatter getFatter(String type){
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
