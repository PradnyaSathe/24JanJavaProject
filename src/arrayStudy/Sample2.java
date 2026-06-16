package arrayStudy;

import java.util.Arrays;
public class Sample2 {
        static void main(String[] args) {
        //to check our string is anagram or not
        //convert string to array
        String s1 = "java";
        String s2 = "avaja";
        char[] ar1 = s1.toCharArray();
        char[] ar2 = s2.toCharArray();
    Arrays.sort(ar1);
    Arrays.sort(ar2);
    if(Arrays.equals(ar1,ar2))
    {
        System.out.println("given string is anagram");
    }
else
{
    System.out.println("given string is not anagram");
}
    }
}
