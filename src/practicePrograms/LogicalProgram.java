package practicePrograms;

public class LogicalProgram {
    static void main(String[] args) {
        int a=7;
        if(a%2 !=0)
        {
            System.out.println("given no is prime");
        }

        //star pattern
       int n=5;
        for(int i=1; i<=n;i++)
        {
            for( int j=1; j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
