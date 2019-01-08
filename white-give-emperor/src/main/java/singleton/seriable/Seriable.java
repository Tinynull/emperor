package singleton.seriable;

import java.io.Serializable;

/**
 * 序列化与反序列化时保障单例.
 * 重写readResolve.
 *
 * @ClassName Seriable
 * Create to NULL 2019/1/7/23:04
 */
public class Seriable implements Serializable {

    private Seriable() {
    }

    private static final Seriable INSTANCE = new Seriable();

    public static Seriable getInstance() {
        return INSTANCE;
    }

    public Object readResolve() {
        return INSTANCE;
    }

}
