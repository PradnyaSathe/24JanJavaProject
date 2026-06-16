package arrayStudy;

import java.util.Arrays;

public class Sample {
    static void main(String[] args) {
        String batters[] = new String[5];//declaration part
        //initialization part
        batters[0] ="ishan";
        batters[1]="virat";
        batters[2]="hardik";
        batters[3]="rohit";
        batters[4]="dhoni";
        //print values
        System.out.println(batters[0]);
        System.out.println(batters[1]);
        System.out.println(batters[2]);
        System.out.println(batters[4]);
        System.out.println(batters.length);
        System.out.println("=======Normal order===========");

        for(int i=0;i<=batters.length-1;i++)
        {
            System.out.println(batters[i]);
        }
        System.out.println("============Ascending sorted==========");
        Arrays.sort(batters);
        for(int i=0;i<=batters.length-1;i++)
        {
            System.out.println(batters[i]);
        }
        System.out.println("============descending sorted==========");
        for (int i=batters.length-1;i>=0;i--)
        {
            System.out.println(batters[i]);
        }
    }
}
