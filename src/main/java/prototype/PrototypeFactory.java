package prototype;

public class PrototypeFactory {
    public static class ModelType
    {
        public static final String MOVIE = "movie";
        public static final String SONG = "album";
        public static final String SHOW = "show";
    }
    private static java.util.Map<String , PrototypeInterface> prototypes = new java.util.HashMap<String , PrototypeInterface>();

    static
    {
        prototypes.put(ModelType.MOVIE, new Movie());
        prototypes.put(ModelType.SONG, new Song());
        prototypes.put(ModelType.SHOW, new Show());
    }

    public static PrototypeInterface getInstance(final String s) throws CloneNotSupportedException {
        return ((PrototypeInterface) prototypes.get(s)).clone();
    }
}
