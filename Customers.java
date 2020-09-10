public class Customers {
    String custName;
    String custNum;
    String custEmail;
    String custAddress;

    public Customers(String custName,String custNum, String custEmail,String custAddress){
        
        this.custName = custName;
        this.custNum = custNum;
        this.custEmail = custEmail;
        this.custAddress = custAddress;
    }

    public String getCustName(){
        return custName;
    }

    public String getCustNum(){
        return custNum;
    }

    public String getCustEmail(){
        return custEmail;
    }

    public String getCustAddress(){
        return custAddress;
    }

    public String toString(){
        String output = "Customer Name: " + custName;
        output += "\nPhone Number: " + custNum;
        output += "\nEmail Address: " + custEmail;
        output += "\nPhysical Address: " + custAddress;

        return output;
    }

}