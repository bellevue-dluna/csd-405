import java.util.ArrayList;

/* Denae Luna
 CSD 405
 22 Aug 2021
 Module 2 */
public class Fan {
    static int fanCounter = 0;

    final int STOPPED = 0;
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    int fanSpeed;
    private boolean fanStatus;
    private int fanRadius;
    private String fanName;
    String fanColor;
    String strFanStatus;
    String strFanSpeed;
    
    // default constructor
    public Fan() {
        fanSpeed = STOPPED;
        fanRadius = 6;
        fanColor = "white";
        setFanStatus();
        setStrFanSpeed();
        fanCounter++;
        setFanName();
    }

    // argument constructor
    public Fan(int speed, int radius, String color){
        fanSpeed = speed;
        fanRadius = radius;
        fanColor = color;
        setFanStatus();
        setStrFanSpeed();
        fanCounter++;
        setFanName();
    }
    
    // public setter methods
    public void setFanSpeed(int fanSpeed) {
        this.fanSpeed = fanSpeed;
        setStrFanSpeed();
    }

    public void setFanColor(String fanColor) {
        this.fanColor = fanColor;
    }

    public void setFanRadius(int fanRadius) {
        this.fanRadius = fanRadius;
    }

    //class setter method for Strings fan status and speed
    private void setFanStatus() {
        if (this.fanSpeed == STOPPED){
            this.fanStatus = false;
            this.strFanStatus = "OFF";
        } else {
            this.fanStatus = true;
            this.strFanStatus = "ON";
        }
    }

    private void setStrFanSpeed(){
        switch(this.fanSpeed){
            case 0:
                strFanSpeed = "Stopped";
                break;
            case 1: 
                strFanSpeed = "Slow";
                break;
            case 2:
                strFanSpeed = "Medium";
                break;
            case 3:
                strFanSpeed = "Fast"; 
                break;
        }
    }

    private void setFanName(){
        fanName = String.valueOf(fanCounter);
    }

    public int getFanSpeed() {
        return fanSpeed;
    }

    public String getFanColor() {
        return fanColor;
    }

    public int getFanRadius() {
        return fanRadius;
    }

    public String getStrFanStatus(){
        return strFanStatus;
    }

    public String getStrFanSpeed(){
        return strFanSpeed;
    }

    public String getFanName(){
        return fanName;
    }

    public static void fanDetailsString(Fan f){
        String fanDesc = "\n\nFan number: " + f.getFanName();
        fanDesc += "\nFan Status: " + f.getStrFanStatus();
        fanDesc += "\nFan Color: " + f.getFanColor();
        fanDesc += "\nFan Radius: " + f.getFanRadius();
        fanDesc += "\nFan Speed: " + f.getStrFanSpeed() + "\n-------------\n";
        System.out.println(fanDesc);;
    }

    public static void fanListDetailsString(ArrayList<Fan> f){
        ArrayList<String> fanDescriptions = new ArrayList<String>();
        for(int i = 0; i<f.size(); i++){
            String fanDesc = "\n\nFan number: " + f.get(i).getFanName();
            fanDesc += "\nFan Status: " + f.get(i).getStrFanStatus();
            fanDesc += "\nFan Color: " + f.get(i).getFanColor();
            fanDesc += "\nFan Radius: " + f.get(i).getFanRadius();
            fanDesc += "\nFan Speed: " + f.get(i).getStrFanSpeed() + "\n-------------\n";
            fanDescriptions.add(fanDesc);
            System.out.println(fanDescriptions.get(i));
        }
    }

    public static void main(String[] args) {
        
        // create default fan and print results
        Fan defaultFan = new Fan();
        System.out.println("Default Fan Information: ");
        fanDetailsString(defaultFan);

        // create a collection (arraylist) of Fans
        ArrayList<Fan> blueFans = new ArrayList<Fan>();

        // initializing instances of the Fans and adding them to the list
        for(int i =0; i<4; i++){
            Fan blueFan = new Fan();
            blueFan.setFanRadius(i*2);
            blueFan.setFanSpeed(i);
            blueFan.setFanColor("blue");
            blueFans.add(blueFan);
        }
        System.out.println("Fan List Info: ");
        fanListDetailsString(blueFans);
    }
}
