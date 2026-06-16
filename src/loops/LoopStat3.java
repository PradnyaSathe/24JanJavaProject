package loops;

public class LoopStat3 {
    static void main(String[] args) {
        int x=20;
        int y=30;
        int a=x;
        System.out.println("a--->"+a);
        int b=x++;//post increment
        System.out.println("b--->"+b);
        System.out.println("x--->"+x);
        int c=++y;
        System.out.println("c--->"+c);
        System.out.println("y--->"+y);
    }
}
