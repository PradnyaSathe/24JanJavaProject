package logicalPrograms;

public class WhileLoop {
    static void main(String[] args) {
        int a=1;
        while(a<=10)
        {
            System.out.println(a);
            a++;
        }
        //print even no of 1 to 10
        int b=1;
        while(b<=10)
        {
            if(b%2==0)
            {
                System.out.println(b);
            }
            b++;
        }
    }
}
