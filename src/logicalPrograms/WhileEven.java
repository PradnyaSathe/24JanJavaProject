package logicalPrograms;

public class WhileEven {
    static void main(String[] args) {
        //print 1 to 10 no
        for(int i=1;i<=10;i++)
        {
            System.out.println(i);
        }

        //print 1 to 20 even num
        int a=1;
        while(a<=20)
        {
            if (a%2==0)
            {
                System.out.println(a + " ");
            }
                a++;
            }
        //print even num from 1 to 20
        for(int b=1;b<=20;b++)
        {
            if(b%2==0)
            {
                System.out.println(b);
            }
        }

        }
    }

