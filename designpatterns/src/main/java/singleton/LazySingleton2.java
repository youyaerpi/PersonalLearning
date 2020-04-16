package singleton;

/**
 * <p>懒汉式(双重检查 DCL)
 * 优点：线程安全；延迟加载；效率较高。
 * 缺点：JDK < 1.5 的时候不可用
 * </p>
 *
 * @author xiexiang
 * @date 2019/8/19 3:11 PM
 */
public class LazySingleton2 {

    /**
     * volatile 保证内存可见性
     */
    private static volatile LazySingleton2 lazySingleton;

    private LazySingleton2() {

    }

    public static LazySingleton2 getInstance() {
        if (null == lazySingleton) {
            synchronized (LazySingleton2.class) {
                if (null == lazySingleton) {
                    lazySingleton = new LazySingleton2();
                }
            }
        }
        return lazySingleton;
    }
}
