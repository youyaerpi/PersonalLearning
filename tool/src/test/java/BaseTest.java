import org.junit.Test;
import org.junit.runner.RunWith;;

/**
 * @author xiexiang
 * @date 2020/4/16 10:22 上午
 */
public class BaseTest {

    @Test
    public void fun1(){
        boolean flag = true;
        Integer i = 0;
        int j = 1;
        int k = true ? i : j;
    }
}
