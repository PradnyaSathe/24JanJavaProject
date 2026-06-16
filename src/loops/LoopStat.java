package loops;

public class LoopStat {
    static void main(String[] args) {
        int x=30;
        int y=40;
        System.out.println("x-->" +x);
        int a=x;
        System.out.println("a-->" +a);
        int b=x++; //post increment
        System.out.println("b" +b);
        System.out.println("x" +x);

        int c=++y;//pre increment
        System.out.println("c" +c);
        System.out.println("y" +y);

    }
}
