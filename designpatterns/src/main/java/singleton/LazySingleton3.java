package singleton;

/**
 * <p>懒汉式(同步方法)
 * 优点：懒加载，只有使用的时候才会加载，获取单例方法加了同步锁，保障线程安全。
 * 缺点：效率太低了，每个线程在想获得类的实例时候，执行getInstance()方法都要进行同步。
 * </p>
 *
 * @author xiexiang
 * @date 2019/8/19 3:11 PM
 */
public class LazySingleton3 {

    private static LazySingleton3 lazySingleton;

    private LazySingleton3() {

    }

    public synchronized LazySingleton3 getInstance() {
        if (null == lazySingleton) {
            lazySingleton = new LazySingleton3();
        }
        return lazySingleton;
    }
}
