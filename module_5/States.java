import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner; 

/* Denae Luna
 CSD 405
 5 Sep 2021
 Module 5 */

public class States{
ArrayList<String> statesList;
int i = 0;

    public States(){
        // initializes ArrayList with 10 states
        statesList = new ArrayList<String>(
            Arrays.asList("Kentucky",
            "Georgia",
            "Florida",
            "California",
            "New Mexico",
            "New York",
            "Hawaii",
            "Alaska",
            "Texas",
            "Oregon"));
    }

    public void printStates(){
        this.statesList.forEach(state -> print(state));
    }

    public void print(String s){
        i++;
        System.out.println(i + " " + s);
    }

    public static Integer tryParse(String s) throws NullPointerException{
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public String getState(int n){
        try{
            return this.statesList.get(n-1);
        }
        catch(IndexOutOfBoundsException aioobe){
            return("That is out of range.");
        }
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        
        String s = "abc"; 
        System.out.println(s.charAt(3));
          
        
        States myStates = new States();
        myStates.printStates();

        System.out.print("Please choose the number of the state you would like to see again: ");
        String choice = input.nextLine();

        int selection = -1; 

        try{
            selection = tryParse(choice);
        }
        catch (NullPointerException npe) {
            System.out.println("You did not enter a valid number. \n Enter a number 1-10");
        }   

        System.out.println(myStates.getState(selection));
                
        input.close();
    }
}