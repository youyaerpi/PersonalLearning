package singleton;

/**
 * <p>
 * 单例模式一:饿汉式(静态常量)
 * 优点：这种写法比较简单，就是在类装载的时候就完成实例化。避免了线程同步问题。
 * <p>
 * 缺点：在类装载的时候就完成实例化，没有达到Lazy Loading的效果。
 * 如果从始至终从未使用过这个实例，则会造成内存的浪费
 * </p>
 *
 * @author xiexiang
 * @date 2019/8/19 2:52 PM
 */
public class HungrySingleton {
    private static final HungrySingleton HUNGRY_SINGLETON = new HungrySingleton();

    private HungrySingleton() {

    }

    public static HungrySingleton getInstance() {
        return HUNGRY_SINGLETON;

    }




}
