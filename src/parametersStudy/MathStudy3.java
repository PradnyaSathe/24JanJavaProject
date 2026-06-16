package parametersStudy;

public class MathStudy3 {
    static void main(String[] args) {
 demo("pradnya",35);
 MathStudy3 mathStudy3=new MathStudy3();
 mathStudy3.demo(40,"pratiksha");
    }
    public static void demo(String name,int rollNum ){
        System.out.println("my name is "+name);
        System.out.println("my roll no is "+rollNum);
    }
    public void demo(int rollNum,String name){
        System.out.println("my roll no is "+rollNum);
        System.out.println("my name is "+name);
    }
}
