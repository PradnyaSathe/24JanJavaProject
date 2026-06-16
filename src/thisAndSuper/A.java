package thisAndSuper;

public class A {
    int x=10;
    int y=60;
    static void main(String[] args) {
 A a=new A();
 a.show();
 a.test();
 B b=new B();
 b.test();
 //method from class B we can call same method name here to creating object of B
    }
    public void show()
    {
        int x=7;
        int sum=x+3;
        int sum1=this.x+3;
        System.out.println(sum);
        System.out.println(sum1);
    }
    public void test()
    {
        System.out.println("A method");
    }

}
