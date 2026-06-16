package logicalPrograms;

import java.util.HashSet;
import java.util.TreeSet;

public class RemoveDuplicateArray1 {
    static void main(String[] args) {
        int array[]={20,20,56,45,90,90,45};
        HashSet<Integer>hashSet=new HashSet<>();
        for(int i:array)
        {
            hashSet.add(i);
        }
        for(Integer a:hashSet)
        {
            System.out.println(a);
        }
        TreeSet<Integer>treeSet=new TreeSet<>();
        for(Integer i:array)
        {
            treeSet.add(i);
        }
        for (Integer a:treeSet)
        {
            System.out.println(a);
        }
    }
}
