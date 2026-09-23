//CadenK
//app for security cameras
class Camera{
    int batteryLife;
    String location;
    boolean status;
    int Recording_Storage;

    public void set_status(boolean s){
        status = s;
    }
    public int getBatteryLife(){
        int batteryLife = 85;

        return (batteryLife);
    }
}

public class Java22_S_cam {
    public static void main(String[] args){
        int bLife = 0;
        Camera frontCamera = new Camera();

        frontCamera.set_status(true);
        bLife = frontCamera.getBatteryLife();
        System.out.println("The camera life is " + bLife);


    }
}
