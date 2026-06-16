package loops;

public class ForLoop2 {
    static void main(String[] args) {
        //I want to print table of 5
        for(int a=5 ; a<=50 ; a=a+5)
        {
            System.out.println(a);
        }
        int sum=0;
        for(int a=1 ;a<=5 ; a++)
          sum=sum+a;
        {
            System.out.println("sum is "+sum);
        }
        //print multiplication table of 2
        for(int i=1 ; i<=10 ; i++)
        {
            System.out.println("2 x"+i+"="+(2*i));
        }
    }
}
