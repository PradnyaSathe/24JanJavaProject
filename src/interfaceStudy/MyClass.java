package interfaceStudy;

public class MyClass implements MyInterface{
    //this is implementation class who is complete the interfaces abstract methods
    @Override
    public void test1() {
        System.out.println("incomplete method complete in implementation class");
    }

    @Override
    public void test2() {
        System.out.println("test2 interface method iscompleted in implementation class ");
    }

    static void main(String[] args) {
        MyClass myClass=new MyClass();
        myClass.test1();
        myClass.test2();
    }
}
