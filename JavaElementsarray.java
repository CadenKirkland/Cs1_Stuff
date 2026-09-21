import java.util.*;
public class JavaElementsarray{
    public static void main(String[] args) {
        String[] elements = {"gold", "tin", "silver", "titanium", "platinum"};
        double[] randoms = new double[5]; // array of 5
        double rand1;
        int len = elements.length;
        for (int k = 0; k < len; k++){
            System.out.println("the element: " + elements[k]);
        }
        for (String i : elements){
            System.out.println(i);
        }
    }
}

