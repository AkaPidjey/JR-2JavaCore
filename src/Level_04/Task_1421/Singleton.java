package Level_04.Task_1421;

public class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        return instance;
    }
}
