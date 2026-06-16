package CollectionStudy;

import java.util.LinkedList;

public class LinkedListStudy1 {
    static void main(String[] args) {
        LinkedList<Integer>linkedList=new LinkedList<>();
        linkedList.add(12);
        linkedList.add(34);
        linkedList.add(45);
        linkedList.add(90);
        linkedList.add(23);
        linkedList.add(34);
        System.out.println(linkedList);

        linkedList.add(2,78);
        System.out.println(linkedList);

        System.out.println( linkedList.size());
        System.out.println(linkedList.contains(34));
        //System.out.println(linkedList.get(5));
       // System.out.println(linkedList.element());
        System.out.println(linkedList.offer(29));
        System.out.println(linkedList);
        System.out.println(linkedList.offerFirst(80));
        System.out.println(linkedList);
        System.out.println(linkedList.offerLast(100));
        System.out.println(linkedList);
        //peek----only print head element not remove it
        System.out.println(linkedList.peek());
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        //poll---print head and also remove it
        System.out.println(linkedList.poll());
        System.out.println(linkedList);
        System.out.println(linkedList.pollFirst());
        System.out.println(linkedList);
        System.out.println(linkedList.pollLast());
        System.out.println(linkedList);
    }
}
