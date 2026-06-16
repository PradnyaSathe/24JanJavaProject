package CollectionStudy;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetStudy {
    static void main(String[] args) {

        HashSet<Object>hashSet=new HashSet<>();
        hashSet.add("test");
        hashSet.add(23);
        hashSet.add(null);
        hashSet.add(true);
        hashSet.add("test");
        hashSet.add(456);
        System.out.println(hashSet);
        System.out.println("=========each for loop=========");
        for (Object o:hashSet)
        {
            System.out.println(o);
        }

        System.out.println("==========iterator=============");

        Iterator<Object>it=hashSet.iterator();
        //only for single value
        it.next();
        System.out.println(it.next());



        //if want to print hole list
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
