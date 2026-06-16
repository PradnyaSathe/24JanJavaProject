package logicalPrograms;

import java.util.Scanner;

public class ReverseStringScanner {
    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your string to be reverse");

        String a1=scanner.next();
        String rev="";
        for(int i=a1.length()-1;i>=0;i--)
        {
            char temp=a1.charAt(i);
            rev=rev+temp;
        }
        System.out.println(a1);
        System.out.println(rev);

        System.out.println("======================");
        String s1="testing is good";
        String rev1="";
        for(int i=s1.length()-1;i>=0;i--)
        {
            char t=s1.charAt(i);
            rev1=rev1+t;
        }
        System.out.println(rev1);
    }
}
