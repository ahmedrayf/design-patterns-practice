package prototype;

public class ProtoTypeDriver {
    public static void main(String[] args) {
        try {
            String moviePrototype = PrototypeFactory.getInstance(PrototypeFactory.ModelType.MOVIE).toString();
            System.out.println(moviePrototype);

            String albumPrototype = PrototypeFactory.getInstance(PrototypeFactory.ModelType.SONG).toString();
            System.out.println(albumPrototype);

            String showPrototype = PrototypeFactory.getInstance(PrototypeFactory.ModelType.SHOW).toString();
            System.out.println(showPrototype);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
