import java.util.Scanner;
class Product{
  int pid;
  float price;
  String pname;
}
 
class ProdArray{
  public static void main(String args[]){
    //int a[]=new int[5]
    Product p[]=new Product[5];
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<5;i++){
      p[i]=new Product();
      System.out.println("enter id");
      p[i].pid=sc.nextInt();
      System.out.println("enter price");
      p[i].price=sc.nextFloat();
      System.out.println("enter name");
      p[i].pname=sc.next();
    }
    for(int i=0;i<5;i++){
      System.out.println(p[i].pid+" "+p[i].price+" "+p[i].pname);
    }
  }
}