package logicalPrograms;

public class Reverse {
    static void main(String[] args) {
        String s="testing";
        String rev="";
        for(int i=s.length()-1; i>=0; i--)
        {
            char t=s.charAt(i);
            rev=rev+t;
        }
        System.out.println(rev);

        String a="MADAM";
        String b="";
        for(int c=a.length()-1;c>=0;c--)
        {
            char d=a.charAt(c);
            b=b+d;
        }
        System.out.println(b);
        if(a.equals(b))
        {
            System.out.println("given string is palindrome");
        }
        else {
            System.out.println("given string is not palindrome");
        }
    }
}
