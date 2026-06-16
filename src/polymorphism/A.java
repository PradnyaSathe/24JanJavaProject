package polymorphism;

public class A {
    //in this there are multiple methods with same method name but different parameters
    //that's why it is called as overloading
    static void main(String[] args) {
  A a=new A();
  a.addition();
  a.addition(6);
  a.addition(4.5f);
    }
    public void addition()
    {
        int a=20;
        int b=30;
        int sum=a+b;
        System.out.println("addition is "+sum);
    }
    public void addition(int a)
    {
        int sum=a+40;
        System.out.println("addition is "+sum);
    }
    public void addition(float a)
    {
        float sum=a+6;
        System.out.println("addition is "+sum);
    }
}
