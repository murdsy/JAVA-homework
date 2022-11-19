/*
 * Create a class named Lease with fields that hold an apartment tenant’s name,
apartment number, monthly rent amount, and term of the lease in months. Include
a constructor that initializes the name to XXx, the apartment number to 0, the
rent to 1000, and the term to 12. Also include methods to get and set each of the
fields. Include a nonstatic method named addPetFee() that adds $10 to the
monthly rent value and calls a static method named explainPetPolicy() that
explains the pet fee. Save the class as Lease.java. 
 */
public class Lease {
    private String tenantName;
    private int aptNr;
    private int monthlyRent;
    private int TermOfLease;

    public Lease(){
        tenantName = "XXX";
        aptNr = 0;
        monthlyRent = 1000;
        TermOfLease = 12;
    }

    public void setData(String nt, int an, int mr, int tol){
        setAptNr(an);
        setTenantName(nt);
        setRent(mr);
        setTOL(tol);
    }

    public void showValues(){
        System.out.println("Tenant: "+getTenantName()+"n");
        System.out.println("Apartament N: "+getAptNr()+"n");
        System.out.println("Monthly rent: "+getMonthlyRent()+"n");
        System.out.println("Term of lease: "+getTermOfLease()+"n");
    }

    //get methods
    public String getTenantName(){
        return tenantName;
    }

    public int getAptNr(){
        return aptNr;
    }

    public int getMonthlyRent(){
        return monthlyRent;
    }

    public int getTermOfLease(){
        return TermOfLease;
    }

    //set methods
    public void setTenantName(String newTenant){
        this.tenantName = newTenant;
    }
    
    public void setAptNr(int newapt){
        this.aptNr = newapt;
    }

    public void setRent(int newRent){
        this.monthlyRent = newRent;
    }

    public void setTOL(int newtol){
        this.TermOfLease = newtol;
    }

    //other mothods
    public void petPolicy(){
        System.out.print("pet policy is that u have to pay 10 dollars on rent extra.");
    }

    public void addPetFee(){
        monthlyRent = monthlyRent+10;
        petPolicy();
    }

}
