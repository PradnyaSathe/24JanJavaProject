package practicePrograms;

public class Constructor {
    int a=5;
    int b=10;
    static void main(String[] args) {
 Constructor constructor=new Constructor();
 Constructor constructor1=new Constructor(40);
 Constructor A=new Constructor(4,6);
 Constructor b=new Constructor("raju");
    }
    public Constructor()
    {
        System.out.println("constructor with zero parameters");
    }
    public Constructor(int a)
    {
        System.out.println("constructor with single parameters");
    }
    public Constructor(int x,int y)
    {
     a=x;
     b=y;
     int sum=x+y;
        System.out.println(sum);
    }
    public Constructor(String name)
    {
        System.out.println("name is "+name);
    }
}
