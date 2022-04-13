package CardFactoryV2;

public class Singleton {
    private static Singleton instance = new Singleton();
    private static int id = -1;

    private Singleton(){}

    public static Singleton getInstance() {
        //synchronized
        return instance;
    }

    public String updateAndGetID(){
        id++;
        return ("ID_" + id);
    }


}
