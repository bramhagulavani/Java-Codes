package OOP_Chap.Polymorphism;

class Animal {
  public void sound() {
    System.out.println("Some sound");
  }
}

class Cat extends Animal {
  @Override
  public void sound() {
    System.out.println("Meow");
  }
}

class Dog extends Animal {
  @Override
  public void sound() {
    System.out.println("Woof");
  }
}

public class Main {
  public static void main(String[] args) {
    Animal a = new Cat();
    Animal b = new Dog();
    a.sound();
    b.sound();
  }
}