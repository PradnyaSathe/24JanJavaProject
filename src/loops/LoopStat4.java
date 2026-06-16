package loops;

public class LoopStat4 {
    static void main(String[] args) {
        int a=40;
        int b=30;
        int x=a--;//post decrement
        System.out.println("x--->"+x);
        System.out.println("a--->"+a);
        int y=--b;//pre decrement
        System.out.println("y--->"+y);
        System.out.println("b--->"+b);

    }
}
