import model.User;
import org.junit.Test;
import singleton.CacheFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
    @Test
    public void fun2(){
        List<String> list=new ArrayList<>();
        list.add("java");
        list.add("c++");
        list.add("c#");
        Collections.sort(list);
        System.out.println(list.toString());
    }
}
