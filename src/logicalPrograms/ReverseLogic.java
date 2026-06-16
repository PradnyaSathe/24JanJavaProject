package logicalPrograms;

public class ReverseLogic {
    static void main(String[] args) {
        String t="pradnya";
        int t1=t.length()-1;
        System.out.println(t1);
        String rev="";
        for(int i=6;i>=0;i--)
        {
            char y=t.charAt(i);
            rev=rev+y;
        }
        System.out.println(rev);

        //String is palindrome or not
        String g="levelw";
        String rev1="";
        for(int y=g.length()-1;y>=0;y--)
        {
            char h=g.charAt(y);
            rev1=rev1+h;
        }
        System.out.println(rev1);
        if(g.equals(rev1))
        {
            System.out.println("given string is palindrome");
        }
        else {
            System.out.println("given string is not palindrome");
        }
    }
}
