package allTypes;

public class D {
    static void main(String[] args) {
demo();
demo(100,50);
D d=new D();
d.demo1();
d.demo1(30,3);
B.my(80,60);
B b=new B();
b.my1(6,6);
    }
    public static void demo()
    {
        int a=40;
        int b=50;
        int sum=a+b;
        System.out.println("sum is "+sum);
    }
    public static void demo(int a,int b)
    {
        int sub=a-b;
        System.out.println("sub is "+sub);
    }
    public void demo1()
    {
        int a=4;
        int b=7;
        int mul=a*b;
        System.out.println("mul is "+mul);
    }
    public void demo1(int a,int b)
    {
        int div=a/b;
        System.out.println("div is "+div);
    }
}


