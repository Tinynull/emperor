package singleton.lazy;

/**
 * 完美的懒汉模式.
 * 在外部类调用的时候内部类才会加载.
 * 不浪费内存，并且效率高.
 *
 * @ClassName LazyPerfect
 * Create to NULL 2019/1/7/22:16
 */
public class LazyPerfect {

    private boolean initialized = false;

    private LazyPerfect() {
        synchronized (LazyPerfect.class){
            if (initialized == false){
                initialized = !initialized;
            }else {
                throw new RuntimeException("单例已被侵犯");
            }
        }
    }

    private static final LazyPerfect getInstance(){
        return LazyHolder.lazyPerfect;
    }

    private static class LazyHolder{
        private static final LazyPerfect lazyPerfect = new LazyPerfect();
    }

}
