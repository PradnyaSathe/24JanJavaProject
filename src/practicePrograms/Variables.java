package practicePrograms;

public class Variables {
    int a=20;
    static int b=10;

    static void main(String[] args) {
show();
Variables A=new Variables();
A.show1();
A.show1(90,80);
    }
    public static void show()
    {
        int a=9;
        int b=10;
        int sum=a+b;
        System.out.println(sum);
       // int sum1=this.a+b;//can not take global variable into static method
        int sum1=a+Variables.b;
        System.out.println(sum1);
    }
    public void show1()
    {
        int a=5;
        int b=4;
        int sum=a+b;
        System.out.println(sum);
        int sum1=this.a+Variables.b;
        System.out.println(sum1);
    }
    public void show1(int a, int b)
    {
        int sum=a+b;
        System.out.println(sum);
        int sum1=this.a+Variables.b;
        System.out.println(sum1);
    }


}
