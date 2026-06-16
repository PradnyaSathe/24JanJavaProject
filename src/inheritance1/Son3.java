package inheritance1;

public class Son3 extends Mother2 {
    static void main(String[] args) {
        Son3 son3=new Son3();
        son3.TV();
        son3.nature();
        scooty();
        height();
    }
    public void TV()
    {
        System.out.println("sony");
    }
    public static void scooty()
    {
        System.out.println("activa");
    }
}
