package logicalPrograms;

public class CountNoOfStringSplit {
    static void main(String[] args) {
        String s1="java study selenium";
             //take string of array bcoz multiple words are there.
        //without array we can not take multiple words in string only one can store.
            String[] s2=s1.split(" ");
        System.out.println(s2.length);

        String a="my name is pradnya";
        String[] a2=a.split(" ");
        System.out.println(a2.length);

        String b="sharvil is my son and he is very intelligent";
        String[] b2=b.split(" ");
        System.out.println(b2.length);

        String c="my name is raju";
        int count=0;

        if(c.length()!=0)
        {
            count = 1;
            for (int i = 0; i <= c.length() - 1; i++) {
                char t=c.charAt(i);
                if (t == ' ')
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
