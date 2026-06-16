package constructorStudy;

public class NewCon1 {
    int a=300;
    int b=400;
    static void main(String[] args) {
NewCon1 newCon1=new NewCon1();
NewCon1 newCon2=new NewCon1(4,8);
    }
    public NewCon1(){
       int sum=a+b;
        System.out.println("sum is "+sum);
    }
    public NewCon1(int a ,int b){
        System.out.println(a);
        System.out.println(b);
    }
}
