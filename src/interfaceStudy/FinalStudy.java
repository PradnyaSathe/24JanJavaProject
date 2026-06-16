package interfaceStudy;

public class FinalStudy {
    static void main(String[] args) {
        int a = 4;
        System.out.println(a);
        a = a + 1;
        System.out.println(a);
   final int b=5;
        System.out.println(b);
        //b=b+3;
        //we can not re-assign b here bcoz we use final keyword beofe b so its final value
    }
    public void test1()
    {
        System.out.println("method test1");
    }
    final void test2()
    {
        System.out.println("method test2");
    }

}