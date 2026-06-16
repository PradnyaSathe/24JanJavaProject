package methodStudy;

public class NonStatic1 {
    public void a() // non static regular method
         // in this class there is no main method so we can run this method into another class
    {
        System.out.println("java");
    }
    public void addition()//this is non static method this has no main method
    {
        int a=5;//method declaration/assighnment
        int b=5;
        int sum=a+b;
        System.out.println("sum is "+sum);
    }
    public static void sub(){
        int l=7;
        int m=2;
        int sub=l-m;
        System.out.println("sub is "+sub);
    }
    public void mul()
    {
        //first declare variables
        int c=4;
        int d=3;
        int mul=c*d;
        System.out.println("mul is "+mul);
    }
    public static void div()
    {
    int e=10;
    int f=2;
    int div=e/f;
    System.out.println("div is "+div);
    }

}
