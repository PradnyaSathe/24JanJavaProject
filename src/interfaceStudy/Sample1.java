package interfaceStudy;

public interface Sample1 extends Sample {
    //here we have two interfaces so both have abstract methods so can not extends properties
    void test3();
    void test4();
    //if we have two interfaces then we use extends
    //if we have one class and want to take properties of interface to class then use implemets
    //we can not take properties of class into interface
    //we have to creat another implementation class here
}
