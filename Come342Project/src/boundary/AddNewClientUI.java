
package boundary;
import entity.Client;
import java.util.Scanner;
//afranurköse
public class AddNewClientUI {
    public void startInterface(){
        System.out.println("Start interface..");
    
    }
    
    public void CreateClient() {
	 
    
        Scanner input =new Scanner(System.in);
        Client c1=new Client();
        System.out.println("Maili: ");
        String email;
        email=input.next();
        c1.setEmail(email);
        System.out.println("->"+c1.getEmail());
        
        System.out.println("Company Name: ");
        String companyName;
        companyName=input.next();
        c1.setCompanyName(companyName);
        System.out.println("->"+c1.getCompanyName());
        
        System.out.println("Company Address: ");
        String address;
        address=input.next();
        c1.setCompanyAddress(address);
        System.out.println("->"+c1.getCompanyAddress());
        
        System.out.println("ContactName: ");
        String contactName;
        contactName=input.next();
        c1.setContactName(contactName);
        System.out.println("->"+c1.getContactName());
        
    
    }

   
}
