package interfaceStudy;

public class Demo extends FinalStudy{
    static void main(String[] args) {
        Demo demo=new Demo();
        demo.test1();
        demo.test2(); //we can inherate final method but can't override
        FinalStudy finalStudy=new FinalStudy();
        finalStudy.test2();
    }
    @Override
    public void test1()
    {
        System.out.println("method of demo");
    }
   // void test2() we can not override final method
    {

    }

}
