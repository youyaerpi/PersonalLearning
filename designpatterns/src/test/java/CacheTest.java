import model.User;
import org.junit.Test;
import singleton.CacheFactory;

/**
 * @author xiexiang
 * @date 2019/8/19 4:00 PM
 */
public class CacheTest {

    @Test
    public void fun() {
        CacheFactory.registerCacheClass("user",new User());
        User user = (User)CacheFactory.getCacheClass("user");
        User user1 = (User)CacheFactory.getCacheClass("user");
        System.out.println(user==user1);


    }
}
