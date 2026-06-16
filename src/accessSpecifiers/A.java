package accessSpecifiers;

public class A {
    private int a=3;
     int b=40;
 protected int c=4;
 public int d=6;

    static void main(String[] args) {
        A a=new A();
        a.test();
        a.test2();
        a.test3();
        a.test4();
        int sum=1+a.a;
        int sum2=1+a.b;
        int sum3=1+a.c;
        int sum4=1+a.d;
        System.out.println(sum);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(sum4);
    }
    private void test()
    {
        System.out.println("A is private method");
    }
    void test2()
    {
        System.out.println("A is default method");
    }
    protected void test3()
    {
        System.out.println("A is protected method");
    }
    public void test4()
    {
        System.out.println("A is public method");
    }
}
