package CollectionStudy;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetStudy {
    static void main(String[] args) {
        //no duplication value allowed
        //no null value allowed
        //print only same type no generic object allowed in treeset
        TreeSet<Object>treeSet=new TreeSet<>();
        treeSet.add(123);
        treeSet.add(34);
        treeSet.add(123);
        treeSet.add(456);
        treeSet.add(100);
        System.out.println(treeSet);
        System.out.println("=======each for loop==========");
        for (Object o:treeSet)
        {
            System.out.println(o);
        }
        System.out.println("==========Iterator==============");
        Iterator<Object> it= treeSet.iterator();
        while (it.hasNext())
        {
           // it.next();
            System.out.println(it.next());
        }

    }
}
