package logicalPrograms;

public class IfEl12 {
    static void main(String[] args) {
        //my name is pradnya
        String name="pradnya";
        if(name=="pradnya")
        {
            System.out.println(name);
        }
        //if i got marks above 40 then i will pass else fails
        int marks=45;
        if(marks>=40)
        {
            System.out.println("pass");
        }
        else {
            System.out.println("fail");
        }
        //on 1000 i wil get 200off
        //on 2000=300off
        //on 5000=700off

        int shopping=1200;
        if(shopping>=500 && shopping<=1000 )
        {
            System.out.println("200 off");
        }
        else if(shopping>=1000 && shopping<=200)
        {
            System.out.println("700 off");
        }
        else {
            System.out.println("i am not interested to buy");
        }

    }
}
