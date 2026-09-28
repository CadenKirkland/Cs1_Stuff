// app for security cameras
// app for security cameras

class SCamera {
    // instance variables
    String name;
    int batteryLife;
    String location;
    boolean status;
    int recordingStorage;

    //constructor is used to initialize objects instance variables
    SCamera(String n, int bL, String Loc, Boolean s, int rec) {
        name = n;
        batteryLife = bL;
        location = Loc;
        status = s;
        recordingStorage = rec;  // capacity is Gigabytes

    }
    //method for class
    public void setStatus(boolean s) {
        status = s;
        System.out.println("this camera " + name + " is now on");
    }
    //method
    public int getBatteryLife() {
        return (batteryLife); }
    //method
    public void getRecording() {
        System.out.println("camera footage is playing..." + "location: " + location);



    }
    //method
    public void getCurrentView() {
        System.out.println("camera for " + name + "is LIVE view at location: " + location);
    }
    //method
    public void setDirection(int angle) {
        System.out.println("camera view for " + name + "is changing by " + angle + " degrees");
    }

}

public class Java23UpdS_Cams{
    public static void main(String[] args) {

        int bLife = 0;

        //create object from class and initialize its instance variables
        SCamera frontCam = new SCamera("Fcam", 100, "entrance", false, 5);

        frontCam.setStatus(true);
        bLife = frontCam.getBatteryLife();
        System.out.println("this camera life is " + bLife);
        frontCam.getRecording();
        frontCam.getCurrentView();
        frontCam.setDirection(30);

        //create object from class and initialize its instance variables
        SCamera bCam = new SCamera("bCam", 100, "backyardCamera", false, 2);

        bCam.setStatus(true);
        bLife = bCam.getBatteryLife();
        System.out.println("this camera life is " + bLife);
        bCam.getRecording();
        bCam.getCurrentView();
        bCam.setDirection(15);

        //create object from class and initialize its instance variables
        SCamera gCam = new SCamera("gCam", 100, "garage Camera", false, 2);

        gCam.setStatus(true);
        bLife = gCam.getBatteryLife();
        System.out.println("this camera life is " + bLife);
        gCam.getRecording();
        gCam.getCurrentView();
        gCam.setDirection(10);
    }

}