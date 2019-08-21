package singleton;

/**
 * <p>懒汉式(线程安全)
 * 优点：改进了第四种效率低的问题。
 * 缺点：不能完全保证单例，假如一个线程进入了if (singleton == null)判断语句块，
 * 还未来得及往下执行，另一个线程也通过了这个判断语句，这时便会产生多个实例。
 * </p>
 *
 * @author xiexiang
 * @date 2019/8/19 3:11 PM
 */
public class LazySingleton1 {

    private static LazySingleton1 lazySingleton;

    private LazySingleton1() {

    }

    public LazySingleton1 getInstance() {
        if (null == lazySingleton) {
            synchronized (LazySingleton1.class) {
                lazySingleton = new LazySingleton1();
            }
        }
        return lazySingleton;
    }
}
