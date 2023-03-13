class Animal {
  void speak() {
    System.out.println("Animal speaks");
  }
}

class Dog extends Animal{
  void speak(){
    super.speak();
    System.out.println("Dog barks");
  }
}

class AnimalDemo {
  public static void main(String args[]) {
    Dog obj = new Dog();
    obj.speak();
  }
}