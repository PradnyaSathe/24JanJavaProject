package PracticePrograms12;

public class FindDupilcateSringInArray {
    static void main(String[] args) {
        String s[]={"aw","we","we","rt","rt","ty","yu","yu","aw"};
        int count=0;
        for(int i=0;i<=s.length-1;i++) {
            for (int j = i + 1; j <= s.length - 1; j++) {
                if (s[i] == s[j])
                {
                    System.out.println(s[i]);
                    count++;
                }
            }
        }
            System.out.println(count);



    }
    }

