import java.util.Scanner;

public class question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                System.out.print("What is your problem? \n");
        String problem = scanner.nextLine(); 

        
        System.out.print("Have you had this problem before? (yes or no) \n");
        String response = scanner.nextLine();

               switch (response) {
            case "yes":
                System.out.println("Well, you have it again!");
                break;
            case "no":
                System.out.println("Well, you have it now!");
                break;
            default:
                System.out.println("Invalid response!");                 		break;
        }

       
    }
}