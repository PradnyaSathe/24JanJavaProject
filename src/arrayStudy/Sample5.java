package arrayStudy;
import java.util.Arrays;

public class Sample5 {
    static void main(String[] args) {
        int rollNum[] = {50, 79, 40, 38, 10, 48, 20, 7, 10};
        System.out.println(rollNum[6]);
        for (int i = 0; i <= rollNum.length - 1; i++)
        {
            System.out.println(rollNum[i]);
        }
        System.out.println("===============ascending order=============");

    Arrays.sort(rollNum);
        for (int i = 0; i <= rollNum.length - 1; i++)
        {
            System.out.println(rollNum[i]);
        }
        System.out.println("=======descending order=========");
        for (int i=rollNum.length - 1;i>=0 ;i--)
        {
            System.out.println(rollNum[i]);
        }
    }
}

