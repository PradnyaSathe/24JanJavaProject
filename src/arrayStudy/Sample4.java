package arrayStudy;

import java.util.Arrays;

public class Sample4 {
    static void main(String[] args) {
        String bollers[]={"ishan","hardik","virat","rohit"};
        //System.out.println(bollers[0]);
        for(int i=0;i<=bollers.length-1;i++)
        {
            System.out.println(bollers[i]);
        }

        System.out.println("===========ascending order===========");

        Arrays.sort(bollers);
        for(int i=0;i<=bollers.length-1;i++)
        {
            System.out.println(bollers[i]);
        }

        System.out.println("==============descending order============");

        for(int i=bollers.length-1;i>=0;i--)
        {
            System.out.println(bollers[i]);
        }
    }
}
