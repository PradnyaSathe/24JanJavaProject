package variableTypes;

public class Y {
    int a=10;//this is globale variable
    static int b=10;//this is static global variable

    static void main(String[] args) {
Y y=new Y();
y.addition();
    }
    public void addition()
    {
        int a=20;//this is local variable
        int sum=a+b;//here a is local and b is static global
        System.out.println("sum is "+sum);
        int sum1=this.a+b;
        System.out.println("sum1 is "+sum1);
        int b=30;//this local variable
        int sum2=a+b;//here a is local and b is also local
        System.out.println("sum2 is "+sum2);
        //now I want static globle b here but syntax is different for static b
        //what is syntax for static b=className.b
        int sum3=this.a+Y.b;
        System.out.println("sum3 is "+sum3);
    }
}
