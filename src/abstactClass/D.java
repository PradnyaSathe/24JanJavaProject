package abstactClass;

public class D extends C{
    static void main(String[] args) {
        D d=new D();
        d.test();
        d.test1(9,9);
    }
    @Override
    public void test() {
        System.out.println("dbj");
    }
    public void test1(int a,int b)
    {
        System.out.println("parametrised method with 2 int");
    }
}
