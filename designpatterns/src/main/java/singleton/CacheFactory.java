package singleton;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * @author xiexiang
 * @date 2019/8/19 3:27 PM
 */


public class CacheFactory {

    private static final Map<String, Object> OBJECT_MAP = Maps.newConcurrentMap();

    private CacheFactory() {

    }


    public static void registerCacheClass(String key, Object obj) {
        if (OBJECT_MAP.containsKey(key)) {
            return;
        }
        OBJECT_MAP.put(key, obj);
    }

    public static Object getCacheClass(String key) {
        return  OBJECT_MAP.get(key);
    }


}
