package logicalPrograms;

public class CountWhiteSpaces {
    static void main(String[] args) {
        String a="seleniumee";
        int counter=0;
        for(int i=0;i<=a.length()-1;i++)
        {
            char y=a.charAt(i);
            if(y=='e')
            {
                System.out.println(i);
                counter++;
            }
        }
        System.out.println(counter);

        //table of 5 using for loop
        for(int i=5;i<=50;i=i+5)
        {
            System.out.println(i);
        }

        //table of 6 using while loop
        int i=6;
        while(i<=60)
        {
            System.out.println(i);
            i=i+6;
        }

       // table of 7 using do while loop
        int o=7;
        do {
            System.out.println(o);
            o=o+7;
        }while(o<=70);
    }
}
