package interfaceStudy;

public interface Mother1 {

     default void love()
     {
         System.out.println("love");
     }
    static void kindness()
    {
        System.out.println("kind");
    }
}
