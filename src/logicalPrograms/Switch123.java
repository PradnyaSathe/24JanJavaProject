package logicalPrograms;

public class Switch123 {
    static void main(String[] args) {
        //if temp is >=40-->exterem hot
        //temp is >30--hot
        //temp is >=20--mild
        //temp is <=10
        int temp=30;
        switch(temp)
        {
            case 40:
                System.out.println("temp is extrem hot");
                break;
            case 30:
                System.out.println("temp is hot");
                break;
            case 20:
                System.out.println("temp is mild");
                break;
            case 10:
                System.out.println("cold");
                break;
            default:
                System.out.println("write specific no");
                break;
        }
        //write even no between 1 to 10
        int evenNum=8;
        switch(evenNum)
        {
            case 2:
                System.out.println("no is even");
                break;
            case 4:
                System.out.println("no is even");
                break;
            case 6:
                System.out.println("no is even");
                break;
            case 8:
                System.out.println("no is even");
                break;
            case 10:
                System.out.println("no is even");
                break;
            default:
                System.out.println("no is odd");
                break;

        }
    }
}
