package singleton.lazy;

/**
 * 懒汉模式.
 * 在调用方法的时候才实例化并创建对象，节省空间资源.
 * 线程不安全的：如果多个线程同时访问，会创建多个对象.
 *
 * @ClassName Lazy
 * Create to NULL 2019/1/7/21:50
 */
public class Lazy {

    private Lazy() {
    }

    private static Lazy lazy = null;

    private static final Lazy lazy() {
        if (lazy == null) {
            lazy = new Lazy();
        }
        return lazy;
    }
}
