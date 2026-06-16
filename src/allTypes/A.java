package allTypes;

public class A {
    static void main(String[] args) {
info("ravi",46,77.68f);
info1(37888.95865,'A',true);
A a=new A();
a.info2();
a.add(70,5.6f);
B.my(30,56);
B b=new B();
b.my1(60,5.6f);

    }
    public static void info(String name,int rollNum,float marks )
    {
        System.out.println(name);
        System.out.println(rollNum);
        System.out.println(marks);
    }
    public static void info1(double goldWeight,char grade,boolean good)
    {
        System.out.println(goldWeight);
        System.out.println(grade);
        System.out.println(good);//good--true bad--false
    }
    public void info2()
    {
        String name="pradnya";
        int weight=70;
        float marks=90.66f;
        double accountNum=2894647.5372d;
        char div='A';
        boolean result=true;
        System.out.println(name);
        System.out.println(weight);
        System.out.println(marks);
        System.out.println(accountNum);
        System.out.println(div);
        System.out.println(result);
    }
    public void add(int a,float b)
    {
        float mul=a*b;
        System.out.println("mul is "+mul);
    }
}
