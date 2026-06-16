package interfaceStudy;

public interface Father1 {

  default void love()
  {
      System.out.println("love");
  }
  static void kindness()
  {
      System.out.println("kind");
  }
}
