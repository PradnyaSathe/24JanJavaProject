package practicePrograms;

public class Method {
    static void main(String[] args) {
 test();
 Method a=new Method();
 a.test1();
 a.test1(24,50);
 test(30,"priti");
    }
    public static void test()
    {
        String name="pradnya";
        int rollNumber=36;
        System.out.println("my name is "+name);
        System.out.println("my rollNum is "+rollNumber);
           }
    public void test1()
    {
        boolean result=true;
        char div='A';
        System.out.println("my result is "+result);
        System.out.println("my div is "+div);
    }
    public void test1(int a,int b)
    {
        int sum=a+b;
        System.out.println("sum is "+sum);
    }
    public static void test(int rollNum,String name)
    {
        System.out.println(rollNum);
        System.out.println(name);
    }
}
