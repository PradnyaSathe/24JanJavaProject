package practicePrograms;

public class NestedIf {
    static void main(String[] args) {
        String userName="pradnya";
        String password="abs12";
        if(userName=="pradnya")
        {
            System.out.println("write password");
            if(password=="abs12")
            {
                System.out.println("login succesfully");
            }
            else
            {
                System.out.println("wrong password");
            }
        }
        else {
            System.out.println("wrong username");
        }
    }
}
