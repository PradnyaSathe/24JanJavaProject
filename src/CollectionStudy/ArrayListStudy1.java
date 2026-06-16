package CollectionStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListStudy1 {
    static void main(String[] args) {
        ArrayList<Object> arrayList=new ArrayList<>();
        arrayList.add(123);
        arrayList.add("test");
        arrayList.add(true);
        arrayList.add(23.45f);
        arrayList.add(5678);
        System.out.println(arrayList);
        System.out.println("==========normal for loop====== ");
        for (int i=0;i<=arrayList.size()-1;i++)
        {
           // arrayList.get(i);
            System.out.println(arrayList.get(i));
        }
        System.out.println("=======each for loop=========");
        for(Object a:arrayList)
        {
            System.out.println(a);
        }
        System.out.println("========Iterator========");
        Iterator<Object>it=arrayList.iterator();
        while(it.hasNext())
        {
            //it.next();
            System.out.println(it.next());
        }
        System.out.println("========List Iterator========");
       ListIterator<Object>lit=arrayList.listIterator();
        while(lit.hasNext())
        {
           // it.next();
            System.out.println(lit.next());
        }
        System.out.println("========Reverse List Iterator========");

        while(lit.hasPrevious())
        {
            // it.next();
            System.out.println(lit.previous());
        }
    }
}
