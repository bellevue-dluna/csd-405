/* Denae Luna 
12 Sep 21
Module 6 */ 
package companyDivision;

public class DomesticDivision extends Division {
    private String state;

    public DomesticDivision(){
        state = "Not Assigned";
    }

    public DomesticDivision(String name, String acctNumber, String state){
        setName(name);
        setAcctNumber(acctNumber);
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public void display(){
        String message = "DOMESTIC DIVISION";
        message += "\nName: " + getName();
        message += "\nAccount Number: " + getAcctNumber();
        message += "\nSTate: " + state + "\n";
        System.out.println(message);
    }
}
