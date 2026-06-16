package starPatternStudy;

public class Test {
    static void main(String[] args) {

        System.out.println("*");

        //if i want to print 5 stars then
        int star=5;
        for(int i=1;i<=star;i++)
        {
            System.out.println("*");
        }

        System.out.println("==============");
        for(int i=1;i<=star;i++)
        {
            System.out.print("* ");
        }
    }
}
