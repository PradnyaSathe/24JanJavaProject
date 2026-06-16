package CollectionStudy;

import java.util.ArrayList;

public class ArrayListStudy2 {
    static void main(String[] args) {
        ArrayList<Object> arrayList=new ArrayList<>();
        arrayList.add(123);
        arrayList.add("test");
        arrayList.add(true);
        arrayList.add(23.45f);
        arrayList.add(5678);
        System.out.println(arrayList);
        //addfirst method of arrayList
        arrayList.addFirst("888");
        System.out.println(arrayList);
        //addlast method
        arrayList.addLast("pradnya");
        System.out.println(arrayList);
        //arrayList.clear
        //arrayList.clear();
        //System.out.println(arrayList);
        Object a=arrayList.clone();
        System.out.println(a);
      //equals method
        Object b=arrayList.equals(a);
        System.out.println(b);
      //contains method
        Object c=arrayList.contains("pradn");
        System.out.println(c);
     //get method
        Object d=arrayList.get(5);
        System.out.println(d);
        //indexof method
        Object e=arrayList.indexOf(true);
        System.out.println(e);
     //size() method
        Object f=arrayList.size();
        System.out.println(f);
     //isEmpty method
     Object g=arrayList.isEmpty();
        System.out.println(g);
        //remove index basis method
        Object h=arrayList.remove(3);
        System.out.println(h);
        System.out.println(arrayList);
        //removefirst method
        Object i=arrayList.removeFirst();
        System.out.println(i);
        System.out.println(arrayList);
        //removeLast same as removefirst only change is remove last no
        //set method
        Object j=arrayList.set(1,34);
        System.out.println(j);
        System.out.println(arrayList);
    }
}
