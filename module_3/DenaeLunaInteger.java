/* Denae Luna
 CSD 405
 29 Aug 2021
 Module 3 */

public class DenaeLunaInteger {
    int denae = 44;
    int test;
    static String msg = "The Value is ";

    // constructor
    public DenaeLunaInteger(){
        this.test = 44;
    }

    public DenaeLunaInteger(int me) {
        this.denae = me;
        this.test = 44;
    }

    public int getDenae() {
        return this.denae;
    }

    public int getTest(){
        return this.test;
    }

    public void setDenae(int i) {
        this.denae = i;
    }

    public void setTest(int i) {
        this.test = i;
    }

    public boolean isEven() {
        return (getDenae() % 2) == 0;
    }

    public boolean isOdd() {
        return (getDenae() % 2) != 0;
    }

    public boolean isPrime() {
        int n = getDenae();
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    public static boolean isEven(int e) {
        return (e % 2) == 0;
    }

    public static boolean isOdd(int o) {
        return (o % 2) != 0;
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    public boolean equals(int n){
        return this.denae == n;
    }

    public boolean equals(Integer n){
        return this.denae == (new Integer(n)).intValue();
    }

    public static void main(String[] args) {
        // created object with denae value of 14
        DenaeLunaInteger i44 = new DenaeLunaInteger(44);

        // created object and set value of 44
        DenaeLunaInteger idefault = new DenaeLunaInteger();

        // created object with denae value of 88
        DenaeLunaInteger i88 = new DenaeLunaInteger(88);

        System.out.println("Denae is: " + i44.getDenae()); // 44
        System.out.println("Test variable is : " + i44.getTest()); // 44
        System.out.println("Denae is even: " + i44.isEven()); // true
        System.out.println("Denae is odd: " + i44.isOdd()); // false
        System.out.println("Denae is prime: " + i44.isPrime()); // false
        System.out.println("Denae is equal to test object: " + i44.equals(44));
        System.out.println("Denae is equal to test primitive: " + i44.equals(i44.getTest()));

        System.out.println("\n\nDenae is :" + idefault.getDenae());
        System.out.println("Test variable is: " + idefault.getTest());
        idefault.setDenae(10);
        idefault.setTest(1);
        System.out.println("Denae is now set to " + idefault.getDenae()); // 10
        System.out.println("Test is now set to " + idefault.getTest()); // 1
        System.out.println("Denae is even: " + idefault.isEven()); // true
        System.out.println("Denae is odd: " + idefault.isOdd()); // false
        System.out.println("Denae is prime: " + idefault.isPrime()); // false
        Integer test = new Integer(idefault.getTest());
        System.out.println("Denae is equal to test object: " + idefault.equals(test));
        System.out.println("Denae is equal to test primitive: " + idefault.equals(44));

        System.out.println("\n\nDenae is: " + i88.getDenae()); // 88
        System.out.println("Test variable is : " + i88.getTest()); // 44
        System.out.println("Denae is even: " + i88.isEven()); // true
        System.out.println("Denae is odd: " + i88.isOdd()); // false
        System.out.println("Denae is prime: " + i88.isPrime()); // false
        System.out.println("Denae is equal to test object: " + i88.equals(test)); //false
        System.out.println("Denae is equal to test primitive: " + i88.equals(44)); //false

        System.out.println("\n\nstatic method isEven on 44: " + DenaeLunaInteger.isEven(44));
        System.out.println("static method isOdd on 44: " + DenaeLunaInteger.isOdd(44));
        System.out.println("static method isPrime on 44: " + DenaeLunaInteger.isPrime(44)) ;

    }
}