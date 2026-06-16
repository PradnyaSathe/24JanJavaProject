package CollectionStudy;

import java.util.Vector;

public class VectorStudy1 {
    static void main(String[] args) {
        Vector<String>vector=new Vector<>();
        vector.add("test");
        vector.add("test1");
        vector.add("test3");
        vector.add("test4");
        vector.add("test5");
        System.out.println(vector);
        vector.add(4,"teju");
        System.out.println(vector);
        System.out.println(vector.get(3));
        System.out.println(vector.elementAt(2));
      vector.addElement("test7");
        System.out.println(vector);
        vector.add(3,"oops");
        System.out.println(vector);
        vector.insertElementAt("ruyd",2);
        System.out.println(vector);

    }
}


