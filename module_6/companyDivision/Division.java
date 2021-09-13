/* Denae Luna 
12 Sep 21
Module 6 */

package companyDivision;

public abstract class Division {
    private String name;
    private String acctNumber;
    
    protected Division(){
        this.name = "default";
        this.acctNumber = "XXXX";
    }

    protected Division(String name, String acctNumber){
        this.name = name;
        this.acctNumber = acctNumber;
    }

    public String getName(){
        return name;
    }

    public String getAcctNumber(){
        return acctNumber;
    }
    
    public void setAcctNumber(String acctNumber) {
        this.acctNumber = acctNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void display();
}
