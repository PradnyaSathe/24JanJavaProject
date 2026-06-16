package allTypes;

public class C {
    String name;
    int rollNum;
    float marks;
    char div;
    boolean result;

    static void main(String[] args) {
 C c=new C();
    c.info();
    C c1=new C("pune" +
            "" +
            "",3456789);
    }
    public void info()
    {
        System.out.println(name);
        System.out.println(rollNum);
        System.out.println(marks);
        System.out.println(div);
        System.out.println(result);
    }
public C()
{
    name="pradnya";
    rollNum=60;
    marks=90.9f;
    div='c';
    result=true;
}
public C(String cityName,int population)
{
    name=cityName;
    rollNum=population;
    System.out.println(cityName);
    System.out.println(population);
}
}
