package variableTypes;

public class W {
    int a=10;
    static int b=5;

    static void main(String[] args) {
   addition();
    }
    public static void addition()
    {
        int a=20;
        int sum=a+b;//here a is local and b is static global
        System.out.println("sum is "+sum);
        int b=10;
        int sum1=a+b;//a is local and b is also local
        System.out.println("sum1 is "+sum1);
       // int sum2=(this.a) if I want global a here but
        // we can not take global variable within the static method
        //we can take static global b variable within the static method
        int sum2=a+W.b;//here a is local and b is static global variable
        System.out.println("sum2 is "+sum2);
        }
}
