package practicePrograms;

public class Switch1 {
    static void main(String[] args) {
        int month = 1;
        switch (month) {
            case 1:
                System.out.println("january");
                break;
            case 2:
                System.out.println("feb");
                break;
            case 3:
                System.out.println("march");
                break;
            case 4:
                System.out.println("april");
                break;
            case 5:
                System.out.println("may");
                break;
            default:
                System.out.println("enter between 1_12 ");
                break;

        }
    }
}
