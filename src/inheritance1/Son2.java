package inheritance1;

public class Son2 extends Mother2{
    static void main(String[] args) {
        Son2 son2=new Son2();
        son2.car();
        son2.nature();
        mobile();
        height();
    }
    public void car()
    {
        System.out.println("TATA");
    }
    public static void mobile()
    {
        System.out.println("samsung");
    }
}
