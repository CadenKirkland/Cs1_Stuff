//CadenK
// App for securtiy cams
//
class Camera{
    int batteryLife;
    String location;
    boolean status;
    int recordingstorage;
    String message;

    public void setStatus(boolean s){
        status = s;
        System.out.println("this camera is now on");
    }

    public int getBatteryLife(){
        int batteryLife = 85;
        return(batteryLife);
    }
    public void getRecording(){
        System.out.println("camera footage is playing...");
    }
    public void getCurrentView(){
        System.out.println("camera is LIVE viewing");
    }
    public void setDirection(int angle){

        System.out.println("camera view us changing by " + angle + " degree");
    }
    public void setMessage(){
        System.out.println("Hello how can I help you");
    }

}

public class Java22_S_cam {
    public static void main(String[] args){
        int bLife = 0;
        Camera frontCam = new Camera();
        Camera backCam = new Camera();

        frontCam.setStatus(true);
        backCam.setStatus(false);

        bLife = frontCam.getBatteryLife();
        System.out.println("this camera life is "+ bLife);
        bLife = backCam.getBatteryLife();
        System.out.println("this camera life is "+ bLife);

        frontCam.getRecording();
        backCam.getRecording();

        frontCam.getCurrentView();
        backCam.getCurrentView();

        frontCam.setDirection(30);
        backCam.setDirection(15);

        frontCam.setMessage();
    }
}