
import boundary.AddNewClientUI;
import java.util.*;


//Test
//ortak
public class Come342Project {


    public static void main(String[] args) {
        System.out.println("1) Add a new client");
        System.out.println("2) Add a new campaign");
        System.out.println("5) Assign staff to work on a campaign");
        System.out.println("8) Create concept note");
        System.out.println("12) Add a new member of staff");
        System.out.print("Enter your choice :");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        switch(choice) {
            case 1:
                AddNewClientUI a = new AddNewClientUI();
                a.CreateClient();
            break;
            
            default:
                System.out.println("Your choice not correct");
            break;
        }
    }   

       
       
}
    

