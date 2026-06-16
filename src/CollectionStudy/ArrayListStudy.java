package CollectionStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListStudy {
    static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("test");
        arrayList.add("false");
        arrayList.add("oops");
        arrayList.add("velocity");
        arrayList.add("678");
        System.out.println(arrayList);
        System.out.println("==========normal for loop==========");
        for(int i=0;i<=arrayList.size()-1;i++)
        {
            arrayList.get(i);
            System.out.println( arrayList.get(i));
        }
        System.out.println("====each for loop==========");
        for(String a:arrayList)
        {
            System.out.println(a);
        }
        System.out.println("==========iterator==========");
        Iterator<String> it=arrayList.iterator();
        while(it.hasNext())
        {
            //it.next();
            System.out.println(it.next());
        }

        System.out.println("==========List Iterator=======");
        ListIterator<String> lit=arrayList.listIterator();
        while(lit.hasNext())
        {
            System.out.println(lit.next());
        }
        System.out.println("==========reverse List Iterator=======");
        while(lit.hasPrevious())
        {
            System.out.println(lit.previous());
        }

    }
}
