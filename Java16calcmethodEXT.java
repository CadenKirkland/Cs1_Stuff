//CadenK
//demonstrate methods that return various values

class calculators{
    // method that returns a double value
    public double calculateArea(double radius) {
        return Math.PI * radius*radius;
    }
    public double square(double num2) {
        return num2 * num2;
    }
    //method that returns an int value
    public int add(int a, int b){
        return a + b;
    }
    public int multiply(int c, int d) {
        return c * d;
    }
    public boolean isEven(int number)  {
        boolean status = false;
        double remainder = number % 2;
        if (remainder == 0) {
            status = true;
        }
        return status;
    }
    // method that returns a String text value
    public String greet(String name){
        String message = "hello "+ name;
        return message;
    }

}
public class Java16calcmethodEXT {
    public static void main(String[] args) {


        calculators calc = new calculators();

        int sum = calc.add(3, 4);
        System.out.println("the sum of the numbers: " + sum);

        double area = calc.calculateArea(7);
        System.out.println(" the area is "+ area);

        boolean answer = calc.isEven(13);
        System.out.println("the status is: " + answer);

        String msg = calc.greet("john");
        System.out.println("the greeting is: "+ msg);

        int product = calc.multiply(10, 11);
        System.out.println("the product is: "+ product);

        double result = calc.square(4);
        System.out.println("the squared number is: "+ result);
    }
}
