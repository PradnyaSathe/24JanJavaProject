package arrayStudy;

import java.util.Arrays;

public class Sample3 {
    static void main(String[] args) {
        //anagram string
        String s1="listen";
        String s2="silent";
        char[] ar1=s1.toCharArray();
        char[] ar2=s2.toCharArray();
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        if(Arrays.equals(ar1,ar2))
        {
            System.out.println("its anagram string");
        }
        else
        {
            System.out.println("not anagram string");
        }
    }
}
