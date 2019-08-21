package singleton;

/**
 * <p>懒汉式</p>
 * 优点： 懒加载，只有使用的时候才会加载。
 * 缺点： 只能在单线程下使用。
 * 如果在多线程下，一个线程进入了if (null == lazySingleton)判断语句块，还未来得及往下执行，
 * 另一个线程也通过了这个判断语句，这时便会产生多个实例。
 * 所以在多线程环境下不可使用这种方式。
 *
 * @author xiexiang
 * @date 2019/8/19 3:11 PM
 */
public class LazySingleton {

    private static LazySingleton lazySingleton;

    private LazySingleton() {

    }

    public LazySingleton getInstance() {
        if (null == lazySingleton) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
