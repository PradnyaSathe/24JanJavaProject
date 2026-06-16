package constructorChaining;

public class X {
    static void main(String[] args) {
 X x=new X();
    }
    public X()
    {
       // this(10);
        System.out.println("without parameter constructor");
    }
    public X(int a)
    {
       // this("pradnya");
        System.out.println("with integer parameter costructore");
        System.out.println(a);
    }
    public X(String x)
    {
        System.out.println("constructor with String");
        System.out.println(x);
    }
}
