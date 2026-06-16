package controlStatements;

public class ElseIfStudy {
    static void main(String[] args) {
        //if temperature > 40 then---> extreme hot
        //if temperature >30 then---hot
        //if temperature >20 then---mild
        //if temperature >=10---cold
        int temperature=10;
        if(temperature>40)
        {
            System.out.println("extreme hot");
        }
        else if (temperature>30) {
            System.out.println("hot");
        }
        else if (temperature>20) {
            System.out.println("mild");
        }
        else if (temperature>=10) {
            System.out.println("cold");
        }
        else
        {
            System.out.println("wrong prediction");
        }
    }
}
