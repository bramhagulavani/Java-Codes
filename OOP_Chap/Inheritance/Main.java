package OOP_Chap.Inheritance;

class Animal {
  public void eat() {
    System.out.println("Eating...");
  }
}

class Dog extends Animal {
  public void bark() {
    System.out.println("Woof!");
  }
}

public class Main {
  public static void main(String[] args) {
    Dog d = new Dog();
    d.eat();  // from Animal
    d.bark(); // own method
  }
}
