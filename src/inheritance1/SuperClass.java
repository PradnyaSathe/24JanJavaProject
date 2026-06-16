package inheritance1;

public class SuperClass extends SuperMost {
    static void main(String[] args) {
        SuperClass superClass=new SuperClass();
        superClass.money();
        superClass.height();
        color();
        nature();
    }
    public void money()
    {
        System.out.println("money");
    }
    public static void color()
    {
        System.out.println("color");
    }
}

