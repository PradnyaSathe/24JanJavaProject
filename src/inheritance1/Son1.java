package inheritance1;

public class Son1 extends Mother1 {
    static void main(String[] args) {
  Son1 son1=new Son1();
  son1.weight();
  age();
  son1.nature();
  color();

    }
    public void weight()
    {
        System.out.println("weight");
    }
    public static void age()
    {
        System.out.println("age is 20");
    }
}
