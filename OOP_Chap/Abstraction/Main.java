package OOP_Chap.Abstraction;

abstract class Remote {
  abstract public void press(); // no body
}

class TV extends Remote {
  @Override
  public void press() {
    System.out.println("TV turned on");
  }
}

public class Main {
  public static void main(String[] args) {
    Remote r = new TV();
    r.press();
  }
}