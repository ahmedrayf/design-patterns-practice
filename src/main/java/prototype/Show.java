package prototype;

public class Show implements PrototypeInterface{
    @Override
    public PrototypeInterface clone() throws CloneNotSupportedException {
        System.out.println("Cloning Show....");
        return (Show) super.clone();
    }

    @Override
    public String toString() {
        return "Show Class";
    }
}
