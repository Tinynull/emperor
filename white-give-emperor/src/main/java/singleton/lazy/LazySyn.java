package singleton.lazy;

/**
 * 相比lazy，变成了线程安全的，但是效率低.
 *
 * @ClassName LazySyn
 * Create to NULL 2019/1/7/22:10
 */
public class LazySyn {

    private LazySyn() {
    }

    private static LazySyn lazySyn = null;

    public static final synchronized LazySyn getIstamce() {
        if (lazySyn == null) {
            lazySyn = new LazySyn();
        }
        return lazySyn;
    }
}
