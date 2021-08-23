import java.util.Scanner; 

/* Denae Luna
 CSD 405
 15 Aug 2021
 Module 1 */

public class Fan
{
    static int fanCounter = 0;

    final int STOPPED = 0;
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    int fanSpeed;
    private boolean fanStatus;
    private int fanRadius;
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
    }

    // argument constructor
    public Fan(int speed, int radius, String color){
        fanSpeed = speed;
        fanRadius = radius;
        fanColor = color;
        setFanStatus();
        setStrFanSpeed();
        fanCounter++;
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

    //Overrides toString Method to print off variables
    public String toString(){
        String fanDesc = "\n\nFan number: " + fanCounter;
        fanDesc += "\nFan Status: " + getStrFanStatus();
        fanDesc += "\nFan Color: " + getFanColor();
        fanDesc += "\nFan Radius: " + getFanRadius();
        fanDesc += "\nFan Speed: " + getStrFanSpeed() + "\n-------------\n";
        return fanDesc;
    }

    public static void main(String[] args) {
        
        // create default fan and print results
        Fan defaultFan = new Fan();
        System.out.println("Default Fan Information: \n" + defaultFan);

        // create fan using argument constructor
        Fan argFan = new Fan(1, 12, "purple");
        System.out.println("Fan with Argument Constructor: \n" + argFan);

        //create a new scanner object
        Scanner input = new Scanner(System.in);

        //create User fan
        Fan userFan = new Fan();
    
        System.out.print("Please enter Color for new fan: ");
        userFan.setFanColor(input.nextLine());

        System.out.println("\nPlease enter fan speed by choosing a number: ");
        System.out.println("0: STOPPED\n1: SLOW\n2: MEDIUM\n3: FAST.");
        System.out.print("Choice: "); 
        userFan.setFanSpeed(input.nextInt());

        System.out.print("\nPlease enter radius for fan (integer): ");
        userFan.setFanRadius(input.nextInt());

        System.out.println("\n----Your fan information: " + userFan);

        input.close(); // closes out the scanner

    }
}

 