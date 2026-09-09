//CadenK
//demonstrate methods that return various values

class calculator{
    // method that returns a double value
    public double calculateArea(double radius) {
        return Math.PI * radius*radius;
    }
    //method that returns an int value
    public int add(int a, int b){
        return a + b;
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
public class Java15calcmethods {
    public static void main(String[] args) {


        calculator calc = new calculator();

        int sum = calc.add(3, 4);
        System.out.println("the sum of the numbers: " + sum);

        double area = calc.calculateArea(7);
        System.out.println(" the area is "+ area);

        boolean answer = calc.isEven(13);
        System.out.println("the status is: " + answer);

        String msg = calc.greet("john");
        System.out.println("the greeting is: "+ msg);
    }
}
