package logicalPrograms;

import java.util.HashSet;

public class RemoveDuplicateFromArray {
    static void main(String[] args) {

        int array[] = {1, 2, 2, 3, 3};
       // System.out.println(array[4]);
        //for(int i=0;i<=array.length-1;i++)
        //{
        //    System.out.println(array[i]);
        //}
        HashSet<Integer>hashSet=new HashSet<>();
       // hashSet.add(1);
        //hashSet.add(2);
        //hashSet.add(2);
        //hashSet.add(3);
        //hashSet.add(3);
        for(Integer num: array)
        {
            hashSet.add(num);
        }
        for(Integer a:hashSet)
        {
            System.out.println(a);
        }
    }
}
