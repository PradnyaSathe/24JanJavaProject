package polymorphism;

public class B extends A{
    static void main(String[] args)
    {
  B b=new B();
  b.addition();//this is addition method of B class
 // b.addition(5);
  A a=new A();
  a.addition();//this is addition method of A class
    }
    public void addition()
    {
    int a=2;
    int b=3;
    int sum=a+b;
        System.out.println("addition is "+sum);
}

}
