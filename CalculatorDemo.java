/*Create a class named "Calculator" with three methods named "add" with first method takes two parameters of int type. Second add method takes 2 paramters of double type and third add method takes 3 parameters of first two parameters of int and third parameters of long and perform addition operation in each method.*/

class Calculator {
    public void add(int a, int b) {
        int sum = a + b;
        System.out.println("sum:" +sum);
    }

    public void add(double a, double b) {
        double sum = a + b;
        System.out.println("sum:" +sum);
    }

    public void add(int a, int b, long c) {
        long sum = a + b + c;
        System.out.println("sum:" +sum);
    }
}

class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(1, 7);
        calculator.add(5.5, 6.6);
        calculator.add(5, 6, 83);
    }
}