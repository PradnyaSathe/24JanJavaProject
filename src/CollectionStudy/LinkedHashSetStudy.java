package CollectionStudy;

import java.util.Iterator;

//import java.util.LinkedHashSet;
public class LinkedHashSetStudy {
    static void main(String[] args)
    {
        java.util.LinkedHashSet<Object>linkedHashSet=new java.util.LinkedHashSet<>();
        linkedHashSet.add("test");
        linkedHashSet.add(123);
        linkedHashSet.add(123);
        linkedHashSet.add(456);
        linkedHashSet.add(true);
        linkedHashSet.add(56);
        System.out.println(linkedHashSet);
        System.out.println("========each for loop=========");
        for(Object o:linkedHashSet)
        {
            System.out.println(o);
        }
        System.out.println("=========Iterator===============");
        Iterator<Object>it=linkedHashSet.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

    }
}
