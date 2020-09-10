public class Architect {
    
    String archName;
    String phoneNum;
    String archEmail;
    String archAddress;

    public Architect(String archName,String phoneNum,String archEmail,String archAddress){

        this.archName = archName;
        this.phoneNum = phoneNum;
        this.archEmail = archEmail;
        this.archAddress = archAddress;
    }

    public String getArchName(){
        return archName;
    }
    
    public String getPhoneNum(){
        return phoneNum;
    }

    public String getArchEmail(){
        return archEmail;
    }

    public String getArchAddress(){
        return archAddress;
    }

    public String toString() {
        String output = "Architects: " + archName;
        output += "\nPhone Number: " + phoneNum;
        output += "\nEmail Address: " + archEmail;
        output += "\nPhysical Address: " + archAddress;

        return output;
    }
    
}
