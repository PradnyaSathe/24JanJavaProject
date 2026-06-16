package loops;

public class WhileLoop {
    static void main(String[] args) {
        //table of 4
        int a=4;
        while(a<=40)
        {
            System.out.println(a);
            a=a+4;
        }

        char b='A';
        while(b<='Z')
        {
            System.out.println(b);
            b++;
        }

         a=1;
        int diff=10;
        while(a<=5)
        {
            diff=diff-a;
            System.out.println("diff is"+diff);
            a++;
        }
    }
}
