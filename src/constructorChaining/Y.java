package constructorChaining;

public class Y extends X {
    static void main(String[] args) {
        Y y=new Y();
    }
    public Y()
    {
        this(3);
        System.out.println("constructor with zero parameter");
    }
    public Y(int a)
    {
       super("pune");
        System.out.println("constructor with int parameters");
    }
}
