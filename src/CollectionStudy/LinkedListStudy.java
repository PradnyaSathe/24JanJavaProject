package CollectionStudy;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStudy {
    static void main(String[] args) {
        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.add(26);
        linkedList.add(45);
        linkedList.add(67);
        linkedList.add(75);
        linkedList.add(89);
        System.out.println(linkedList);
        System.out.println("========each for loop==========");
        for(Integer a:linkedList)
        {
            System.out.println(a);
        }
        System.out.println("========iterator=========");
        Iterator<Integer>it=linkedList.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        System.out.println("===========list-iterator=====");
        ListIterator<Integer>lit=linkedList.listIterator();
        while (lit.hasNext())
        {
            System.out.println(lit.next());
        }

    }
}
