package constructorStudy;

public class NewCon2 {
    int a=4;
    int b=8;

    static void main(String[] args) {
        NewCon2 newCon2=new NewCon2();
        newCon2.add();
        NewCon2 newCon3=new NewCon2(100,300);
        newCon3.add();
        NewCon2 newCon4=new NewCon2("pradnya",100);
        newCon4.add();
    }
    public void add()
    {
        int sum=a+b;
        System.out.println("sum is "+sum);
    }
    public NewCon2(){
        a=10;
        b=20;
    }
    public NewCon2(int x,int y){
        a=x;
        b=y;
    }
    public NewCon2(String name,int x){
        System.out.println("my name is "+name);
        System.out.println("value is "+x);
    }
}
