package polymorphismStudy;

public class D extends C{
    static void main(String[] args) {
        D d=new D();
        d.test(5,7);
        d.test("fgh",9);
        C c=new C();
        c.test(7,9);
        c.test("yiu",0);
    }
    public void test(int a,int b)
    {
        System.out.println("method from class C");
    }
    public void test(String name,int c)
    {
        System.out.println("different parameters from class C");
    }
}
