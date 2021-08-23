import java.util.Scanner; // 

public class notes {
    public static void main(String[] args) {
        System.out.println("testing");

        //create a new scanner object
        Scanner input = new Scanner(System.in);
        System.out.println("Ask your input question?: ");
        double ask = input.nextDouble();

        input.close(); // closes out the scanner

        final double PI = 3.14159; //declare a constant

        double total = 1;
        double moneyAmount = (int)(total*100)/100; // casting ints for money

        // simplify boolean assignment
        int number = 2;
        boolean even = number % 2 == 0;

        // generating random numbers
        int randnum = (int)(Math.random()*10);

        // use of ternary operator 
        //instead of 
        if (x>0){y=1;}
        else{y = -1;}
        // use
        y = (x>0)? 1: -1;

        //rounding returns double type
        ciel(x); // rounded up 
        floor(x); // rounded down
        rint(x); // nearest unless .5 then it will return teh even one
        round(x); // returns(int)Math.floor(x + 0.5)

        // numbers
        Math.max(2, 3); // returns 3
        Math.min(2.5, 4.6); // returns 2.5
        Math.abs(-2); // returns 2

        // sentinel value loop
        char continueLoop = 'Y';
        while (continueLoop == 'Y'){
            //things
            System.out.print("Enter Y to continue and N to quit");
            continueLoop = input.getLine()charAt(0);
        }
    }
}
