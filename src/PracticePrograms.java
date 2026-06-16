public class PracticePrograms {
    static void main(String[] args) {
        String s="selenieem";
        int count=0;

        for(int i=0;i<=s.length()-1;i++)
        {
            char t=s.charAt(i);
            if(t=='e')
            {
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
}
