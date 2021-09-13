/* Denae Luna 
12 Sep 21
Module 6 */
package companyDivision;

public class UseDivision {
    public static void main(String[] args) {
        
        //creates new domestic divisions
        Division domestic1 = new DomesticDivision("Rally's", "1", "Alabama");
        DomesticDivision domestic2 = new DomesticDivision("Checker's", "2", "Nebraska");

        //displays domestic divisions
        domestic1.display();
        domestic2.display();

        // creates new international divisions
        Division international1 = new InternationalDivision("Wimpy's", "3", "England", "English");
        InternationalDivision international2 = new InternationalDivision("Aussies", "4", "Australia", "English");

        international1.display();
        international2.display();
    }
}
