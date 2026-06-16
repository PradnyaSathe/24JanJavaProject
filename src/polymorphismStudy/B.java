package polymorphismStudy;

public class B extends A{
    static void main(String[] args) {
B b=new B();
b.Add();
A a=new A();
a.Add();
    }
    public void Add()
    {
        System.out.println("Addition method of class B");
    }

}
