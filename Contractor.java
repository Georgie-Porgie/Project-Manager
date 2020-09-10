public class Contractor {

    String contName;
    String contNum;
    String contEmail;
    String contAddress;

    public Contractor(String contName,String contNum, String contEmail,String contAddress){
        
        this.contName = contName;
        this.contNum = contNum;
        this.contEmail = contEmail;
        this.contAddress = contAddress;
    }

    public String getContName(){
        return contName;
    }

    public String getContNum(){
        return contNum;
    }

    public String getContEmail(){
        return contEmail;
    }

    public String getContAddress(){
        return contAddress;
    }

    public String toString(){
        String output = "Contractors: " + contName;
        output += "\nPhone Number: " + contNum;
        output += "\nEmail Address: " + contEmail;
        output += "\nPhysical Address: " + contAddress;

        return output;
    }

}
