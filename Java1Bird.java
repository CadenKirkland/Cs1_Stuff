//CadenK
//create a bird class and its instance variables and methods

class Birds{

    //define instance variables
    
    String type;
    String color;
    String sound;
    String category;

    //define methods
    public void fly(){
        System.out.println(type + " i can fly");
    }

    public void eat(){
        System.out.println(type = " i can eat");
    }
}

//default
public class Java1Bird {
//main method where execution begins
    public static void main(String[] args){

        //creating objects from the Birds class Blueprint
        Birds cBird = new Birds();
        Birds hBird = new Birds();
        Birds oBird = new Birds();

        // assign values to instance values for cBird
        cBird.type = "cardinal";
        cBird.color = "red";
        cBird.sound = "chirp";
        cBird.category = "songbird";

        // execute the inherited methods for the cBird object
        cBird.fly();
        cBird.eat();

        // assign values to instance values for hBird
        hBird.type = "hawk";
        hBird.color = "orange&green";
        hBird.sound = "screech";
        hBird.category = "raptor";

        // execute the inherited methods for the hBird object
        hBird.fly();
        hBird.eat();

        // assign values to instance values for hBird
        oBird.type = "Owl";
        oBird.color = "brown&gray";
        oBird.sound = "hoot";
        oBird.category = "Strigiformes";

        // execute the inherited methods for the oBird object
        oBird.fly();
        oBird.eat();
    }
}
