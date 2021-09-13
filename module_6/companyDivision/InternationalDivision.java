/* Denae Luna 
12 Sep 21
Module 6 */
package companyDivision;

public class InternationalDivision extends Division {
    private String country;
    private String language;
    
    public InternationalDivision(){
        country = "Not Assigned";
        language = "Not Assigned";
    }

    public InternationalDivision(String name, String acctNumber, String country, String language){
        setName(name);
        setAcctNumber(acctNumber);
        this.country = country;
        this.language = language;
    }

    public String getCountry() {
        return country;
    }
    public String getLanguage() {
        return language;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public void display(){
        String message = "INTERNATIONAL DIVISION";
        message += "\nName: " + getName();
        message += "\nAccount Number: " + getAcctNumber();
        message += "\nCountry: " + country;
        message += "\nLanguage: " + language +"\n";
        System.out.println(message);
    }
}
