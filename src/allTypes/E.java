package allTypes;

public class E {
    int a=40;
    int b=50;

    static void main(String[] args) {
E e=new E();
e.add();
E e1=new E(200,70);
e1.add();
E e2=new E(70,50);
e2.add();
E e3=new E();
e3.add();

    }
    public void add()
    {
        int sum=a+b;
        System.out.println(sum);
    }
    public E()
    {
        a=90;
        b=70;
    }
    public E(int x,int y)
    {
        a=x;
        b=y;
    }
}
