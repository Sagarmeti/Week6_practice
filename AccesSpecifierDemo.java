class Demo{
protected int price;
   int pid;
 
}
class Demo1 extends Demo{
  void display(){
    System.out.println(price);
  }
}
 
class AccesSpecifierDemo{
  public static void main(String args[]){
    Demo1 d=new Demo1();
    d.price=12;
    d.display();
  }
}

//private
class Demo{
private int price;
   int pid;
 
}
class Demo1 extends Demo{
  void display(){
    System.out.println(price);
  }
}
 
class AccesSpecifierDemo{
  public static void main(String args[]){
    Demo1 d=new Demo1();
    d.price=12;
    d.display();
  }
}