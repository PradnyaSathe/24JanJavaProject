package logicalPrograms;
import java.util.Arrays;
public class Anagram1 {
    static void main(String[] args) {
        String s="Testing";
        String s1="gnitseT";
        char[] t=s.toCharArray();
        char[] t1=s1.toCharArray();
        Arrays.sort(t);
        Arrays.sort(t1);
        if(Arrays.equals(t,t1))
        {
            System.out.println("given string is anagram");
        }
        else
        {
            System.out.println("given string is not anagram")  ;
        }
    }
    }

