package practicePrograms;

public class for1 {
    static void main(String[] args) {
        // int a=5;
        //table of 5
        for (int a = 5; a <= 50; a = a + 5) {
            System.out.println(a);
        }
        //pre-post increments
        int a = 5;
        int b = 6;
        System.out.println(b);
        System.out.println(a);
        // System.out.println(a++ + ++b);
        System.out.println(++a + b++);

        //pre-post decrements
        int c = 10;
        int d = 5;
        int e = --c;
        System.out.println(e);
        System.out.println(c);
        int f=d--;
        System.out.println(d);
        System.out.println(f);
        System.out.println(--c + d--);

        // while loop reverse table of 3
         a=30;
         while(a>=3)
         {
             System.out.println(a);
             a=a-3;
         }

         //do-while loop even no
        int x=2;
         do {
             if (x % 2 == 0) {
                 System.out.println(x);
             }
                 x++;

         }while(x<=20);

    }
}
