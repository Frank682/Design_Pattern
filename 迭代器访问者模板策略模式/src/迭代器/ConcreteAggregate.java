package 迭代器;
import java.util.*;
class ConcreteAggregate implements  Aggregate {
    private List<Object> list=new ArrayList<Object>();
    public void add(Object obj)
    {
        list.add(obj);
    }
    public void remove(Object obj)
    {
        list.remove(obj);
    }
    public Iterator getIterator()
    {
        return(new ConcreteIterator(list));
    }
}
