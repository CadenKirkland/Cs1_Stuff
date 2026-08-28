//CadenK
//demonstrate creating and using data types in Java

public class Java5DataTypes {

    public static void main(String[] args){
        byte b = 10; // 8 bit integer
        short s = 200;   // 16 bit integer
        int i = 1000;      // 32 bit integer
        long y = 10000000L;  // 64 bit integer

        float pi = 3.14f;       // 32 bit floating point
        double morePI = 3.14159265358979323846;   //64 bit float

        char c = 'A';

        boolean found = true; // boolean value (true or false)
        String message = "hello and welcome to Mars";

        System.out.println("byte value: "+ b);
        System.out.println("short value: " + s);
        System.out.println("int value: " + i);
        System.out.println("long value: " + y);
        System.out.println("float value: "+ pi);
        System.out.println("double value: " + morePI);
        System.out.println("char value: "+ c);
        System.out.println("boolean value: "+ found);
        System.out.println("message value: "+ message);
    }

}
