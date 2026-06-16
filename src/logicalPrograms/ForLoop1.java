package logicalPrograms;

public class ForLoop1 {
    static void main() {
        //table of 5
        for (int a = 5; a <= 50; a = a + 5) {
            System.out.println(a);
        }
        for (char b = 'A'; b <= 'Z'; b++) {
            System.out.println(b);
        }
        for (int a = 2; a <= 40; a = a + 2) {
            System.out.println(a);
        }

        //print even no
        for (int a = 1; a <= 20; a++)
        {
            if (a % 2 == 0)
            {
                System.out.println(a);
            }
        }
        //print revers of 5 to 1
        for(int a=5 ;a>=1 ;a--)
        {
            System.out.println(a);
        }
    }
}