package controlStatements;

public class IfStudy1 {
    static void main(String[] args) {
        //If My Name is pradnya then---> name is correct
        String myName = "Priti";
        if (myName=="Pradnya")
        {
            System.out.println("name is correct");
        }

        //If my height > 160 then--->I am tall
        int height=164;
        if(height>160)
        {
            System.out.println("I am tall");//answer is true-->body executed
        }

        //If I got 97% then my Grade is A
        char grade='B';
        if(grade=='A')
        {
        System.out.println("I got grade A");//answer is false-->Nobody executed
    }
}
}