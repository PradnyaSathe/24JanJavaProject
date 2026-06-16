package interfaceStudy;

public class Son1 implements Father1,Mother1{
    //here we have two same name methods, but it takes only one between two
    //which is not right we have both same methods from different interface
    //first we use default
    static void main(String[] args) {
        Son1 son1=new Son1();
        son1.love();  //using default
        Father1.kindness(); //using static
        Mother1.kindness(); //using static
    }

    @Override
    public void love() {
        Father1.super.love();
        //because we have differentiated between two interfaces which love method is
        Mother1.super.love();
    }
}
