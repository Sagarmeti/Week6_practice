/*create a class named "Shape" with three methods named "area", In first method find the area of the rectangle, second method find the area of the circle and third method find the area of the square.*/

class Shape{

  void area(int length,int width){
    int ar;
    ar=width*length;
    System.out.println("Area of rectangle:"+ar);
  }

  void area(double radius){
    double ar;
    ar=3.14*radius*radius;
    System.out.println("Area of circle:"+ar);
  }

  void area(int side){
    int ar;
    ar=side*side;
    System.out.println("Area of square:"+ar);
    
  }
}

class ShapeDemo{
  public static void main(String args[]){
    Shape s=new Shape();
    s.area(4,2);
    s.area(4.2);
    s.area(7);
  }
}