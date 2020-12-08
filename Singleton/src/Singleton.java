import java.io.Serializable;

public class Singleton implements Serializable, Cloneable {
    public static volatile Singleton INSTANCE = null;
    private Singleton() {

    }
    public static Singleton getInstance() {

        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }

    public Object readResolve() {
        return Singleton.getInstance();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}