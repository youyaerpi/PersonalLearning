package iterator;

import model.Student;

import java.util.Iterator;

/**
 * @author xiexiang
 * @date 2020/4/30 11:52 上午
 */
public class StudentList<E> implements MyCollection<E> {

    private E [] data;

    private int size;

    @Override
    public Iterator<E> iterator() {
        return new MyIterator();
    }

    public int size(){
        return this.size;
    }



    private  class MyIterator implements Iterator<E>{

        @Override
        public boolean hasNext() {
            return size==0;
        }

        @Override
        public E next() {
            return data[1];
        }
    }
}
