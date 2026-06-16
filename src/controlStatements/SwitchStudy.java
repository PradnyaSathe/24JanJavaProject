package controlStatements;

public class SwitchStudy {
    static void main(String[] args) {
        //if temperature is >=40-->extrem hot
        //if temp>=35-->hot
        //if temp>=20-->mild
        //if temp>=10-->cold
        int temperature = 37;
        switch (temperature) {
            case 40:
                System.out.println("extrem hot");
                break;
            case 35:
                System.out.println("hot");
                break;
            case 20:
                System.out.println("mild");
                break;
            case 10:
                System.out.println("cold");
                break;
            default:
                System.out.println("wrong prediction");
                break;
        }
        //on your 1000 shopping you will get 500 off
        //on 2000--->700 off
        //on 3000--->1000 off

        int shopping = 3000;
        switch (shopping)
        {
            case 1000:
                System.out.println("you will get 500 off");
                break;
            case 2000:
                System.out.println("you will get 700 off");
                break;
            case 3000:
                System.out.println("you will get 1000 off");
                break;
            default:
                System.out.println("there are no more offers");
                break;
        }
        //even no-->6
        //odd no-->4
        //even no-->8
        int Number=2;
        switch(Number)
        {
            case 2:
                System.out.println("no is even");
                break;
            case 3:
                System.out.println("no is odd");
                break;
            case 4:
                System.out.println("no is even");
                break;
            default:
                System.out.println("write no between 1_4");
                break;
        }
    }
}