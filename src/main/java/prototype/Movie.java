package prototype;

public class Movie implements PrototypeInterface{
    String name="Cast a way";

    @Override
    public PrototypeInterface clone() throws CloneNotSupportedException {
        System.out.println("Cloning Movie....");
        return (Movie) super.clone();
    }
    @Override
    public String toString() {
        return "Movie Class";
    }
}
