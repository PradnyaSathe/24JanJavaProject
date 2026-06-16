package logicalPrograms;

import java.util.Arrays;

public class ArrayStudy3 {

    static void main(String[] args) {
        int rollNum[]={4,4,5,6,3,6,7};
        System.out.println(rollNum[5]);
        for(int i=0;i<=rollNum.length-1;i++)
        {
            System.out.println(rollNum[i]);
        }
        System.out.println("=============ascending order=========");
        Arrays.sort(rollNum);
        for(int i=0;i<=rollNum.length-1;i++)
        {
            System.out.println(rollNum[i]);
        }
        System.out.println("=======descending order==========");

        for(int i=rollNum.length-1;i>=0;i--
        )
        {
            System.out.println(rollNum[i]);
        }
    }
}
