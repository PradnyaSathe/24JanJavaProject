package CollectionStudy;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetStudy1 {
    static void main(String[] args) {

        HashSet<Integer>hashSet=new HashSet<>();
        hashSet.add(12);
        hashSet.add(12);
        hashSet.add(34);
        hashSet.add(20);
        hashSet.add(40);
        hashSet.add(45);
        System.out.println(hashSet);
        int a=hashSet.size();
        System.out.println(a);

       boolean b=hashSet.contains(12);
        System.out.println(b);
       Object c=hashSet.clone();
        System.out.println(c);

        System.out.println("===========each for loop==============");
        for(Integer ts:hashSet)
        {
            System.out.println(ts);
        }
        System.out.println("======iterator============");
        Iterator<Integer>it=hashSet.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

    }
}
