package iterator;

import java.util.Iterator;

/**
 * 所有集合接口
 * @author xiexiang
 * @date 2020/4/30 11:47 上午
 */
public interface MyCollection<E> extends Iterable<E>{
    /**
     * 返回迭代器
     * @return Iterator
     */
    @Override
    Iterator<E> iterator();


}
