package prototype;

public class Song implements PrototypeInterface{
    @Override
    public PrototypeInterface clone() throws CloneNotSupportedException {
        System.out.println("Cloning Song....");
        return (Song) super.clone();
    }
    @Override
    public String toString() {
        return "Song Class";
    }
}
