import model.User;
import org.junit.Test;
import singleton.CacheFactory;

/**
 * @author xiexiang
 * @date 2019/8/19 4:00 PM
 */
public class CacheTest {

    static {
        CacheFactory.registerCacheClass("user",new User());
    }

    @Test
    public void fun() {
        User user = CacheFactory.getCacheClass("user",User.class );
        User user1 = CacheFactory.getCacheClass("user",User.class );
        System.out.println(user==user1);

    }
}
