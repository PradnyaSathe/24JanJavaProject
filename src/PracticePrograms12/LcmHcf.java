package PracticePrograms12;

public class LcmHcf {
    static void main(String[] args) {
        int a=40;
        int b=50;
        int hcf=1;
        for(int i=1;i<=a && i<=b;i++)
        {
            if(a%i==0 && b%i==0)
            {
                hcf=i;
                System.out.println(hcf);
            }
        }

        int a1=10;
        int b1=20;

        int hcm=1;
        for(int i=b1;i>=1 ;i--)
        {
            if(a1%i==0 && b1%i==0)
            {
                hcm=i;
                System.out.println(hcm);
                break;//if i want to print only one out of all then use break
                //o/p=10,5,2,1 but bcoz of break it prints only 10.
                //lcm=20
            }
        }
                int lcm=(a1*b1)/hcm;
        System.out.println(lcm);


    }
    }

