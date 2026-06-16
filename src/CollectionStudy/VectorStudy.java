package CollectionStudy;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorStudy {
    static void main(String[] args) {
        Vector<Object> vector=new Vector<>();
        vector.add("test");
        vector.add(234);
        vector.add(45.67);
        vector.add(true);
        vector.add('A');
        System.out.println(vector);
        System.out.println("=========for loop normal===========");
        for(int i=0;i<=vector.size()-1;i++)
        {
            System.out.println(vector.get(i));
        }
        System.out.println("=======each for loop========");
        for (Object a:vector)
        {
            System.out.println(a);
        }
        System.out.println("=======Iterator========");
        Iterator<Object>it=vector.iterator();
        while (it.hasNext())
        {
           // it.next();
            System.out.println(it.next());
        }
        System.out.println("=======List Iterator========");
        ListIterator<Object>lit=vector.listIterator();
        while (lit.hasNext())
        {
            // it.next();
            System.out.println(lit.next());
        }
        System.out.println("=======reverse list iterator========");
        while (lit.hasPrevious())
        {
            System.out.println(lit.previous());
        }
        System.out.println("=======enumeration========");
        Enumeration<Object>ele=vector.elements();
        while (ele.hasMoreElements())
        {
            System.out.println(ele.nextElement());
        }
    }
}
