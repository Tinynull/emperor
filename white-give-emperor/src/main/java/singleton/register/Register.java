package singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 注册式单例.
 * 没使用一次，都往一个固定的容器中去注册并且将使用过的对象缓存.
 * 下去直接取，保障jvm中每次都是同一个class
 * 使用concurrentHashMap，是为了方式并发.
 *
 * @ClassName register
 * Create to NULL 2019/1/7/22:10
 */
public class Register {

    private Register() {
    }

    private static Map<String, Object> map = new ConcurrentHashMap<String, Object>();

    public static final synchronized Object getInstance(String className) {
//      如果key不存在,就创建一个对象
        if (!map.containsKey(className)) {
            Object object = null;
            try {
                object = Class.forName(className).newInstance();
                map.put(className, object);

            } catch (Exception e) {
                e.printStackTrace();
            }
            return object;
        } else {
            return map.get(className);
        }

    }

}
