package PracticePrograms12;

public class CountNoOfVowels1 {
    static void main(String[] args) {
        String a1="Automation";
        String a=a1.toLowerCase();
        int count =0;

        for(int i=0;i<=a.length()-1;i++)
        {
            char t=a.charAt(i);
            if(t=='a'||t=='e'||t=='i'||t=='o'||t=='u')
            {
                System.out.println(t);
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
}
