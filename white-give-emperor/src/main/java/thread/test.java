package thread;

/**
 * @ClassName test.
 * Create by Null on 2019/1/9/9:52
 **/
public class test {
    private static final long count = 1000000000;

    public static void main(String[] args) throws InterruptedException {

        concurrency();

        serial();
    }

    // 并行
    private static void concurrency() throws InterruptedException {
        long start = System.currentTimeMillis();

        Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {
                int a = 0;
                for (long i = 0; i < count; i++) {
                    a += 5;
                }
            }
        });
        thread.start();
        int b = 0;
        for (long i = 0; i < count; i++) {
            b--;
        }
        long time = System.currentTimeMillis() - start;
        thread.join();
        System.out.println("concurrency:" + time + "ms,b" + b);
        System.out.println(Runtime.getRuntime().availableProcessors());
    }

    //    串行
    private static void serial() {
        long start = System.currentTimeMillis();

        int a = 0;
        for (long i = 0; i < count; i++) {
            a += i;
        }
        int b = 0;
        for (long i = 0; i < count; i++) {
            b--;
        }
        long time = System.currentTimeMillis() - start;
        System.out.println("serial:" + time + "ms,b=" + b + ",a=" + a);
    }
}
