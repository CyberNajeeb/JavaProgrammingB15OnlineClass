package day49;
    // Interface is like a contract that once digned, all the details must be provided.
public interface Edible {

    //In interface, unless explicitly defined, fields are automatically public static final.
    // public static final field naming convention is ALL_CAPS
    public static final boolean IS_HUMAN_EDIBLE = true;
    public abstract void eat();
    public abstract void drink();
    public abstract void taste();

    public default void digest(){
        System.out.println("Implementing...");
    }
}
