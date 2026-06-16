package polymorphismStudy;

public class C {
    static void main(String[] args) {
        C c=new C();
        c.test(3,6);
        c.test("asc",5);
    }
    public void test(int a,int b)
    {
        System.out.println("parametrised method with 2 int");
    }
    public void test(String name,int c)
    {
        System.out.println("different parameters");
    }
}
