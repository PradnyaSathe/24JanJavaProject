package interfaceStudy;

public class A implements Sample1{
    static void main(String[] args) {
        A a=new A();
        a.test();
        a.test2();
        a.test3();
        a.test4();
    }
    @Override
    public void test3() {
        System.out.println("test3 method of interface sample1 ");
    }

    @Override
    public void test4() {
        System.out.println("test4 method of interface sample1 ");
    }

    @Override
    public void test() {
        System.out.println("test method of interface sample ");
    }

    @Override
    public void test2() {
        System.out.println("test2 method of interface sample ");
    }
}
