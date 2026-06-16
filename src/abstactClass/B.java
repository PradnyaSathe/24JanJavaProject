package abstactClass;

public class B extends A{
    //here class B is concrete class which complete the methods those are incomplete in abstract class

    @Override
    public void show2() {
        System.out.println("pradnya");
    }
public void show3()
{
    System.out.println("show3");
}
    static void main(String[] args) {
        B b=new B();
        b.show2();
        b.show3();
        b.show1();
    }
}
