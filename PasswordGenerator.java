import java.util.*;

class PasswordGenerator 
{
    public static void main(String[] args) 
    {
        // Get password length from user
        System.out.println("                     PASSWORD GENERATOR \n");
        System.out.print("Enter the length of the password: ");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        sc.nextLine();


        // Get user preferences
        System.out.println(" \nEnter 'yes' or 'no' for the following questions:");
        System.out.print("\nShould it contain uppercase letters? ");
        String ans1 = sc.nextLine().toLowerCase();
        System.out.print("Should it contain lowercase letters? ");
        String ans2 = sc.nextLine().toLowerCase();
        System.out.print("Should it contain numbers? ");
        String ans3 = sc.nextLine().toLowerCase();
        System.out.print("Should it contain special characters? ");
        String ans4 = sc.nextLine().toLowerCase();
        
        // Define character sets
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String num = "1234567890";
        String spchar = "<>,.'!@#$%^&*()-_{;:}[]/?\\|`~";
        
        
        StringBuilder sb = new StringBuilder();
        if (ans1.equals("yes")) {
            sb.append(upper);
        }
        if (ans2.equals("yes")) {
            sb.append(lower);
        }
        if (ans3.equals("yes")) {
            sb.append(num);
        }
        if (ans4.equals("yes")) {
            sb.append(spchar);
        }
         
         
        // Check if at least one option was selected
        if(sb.length() == 0) {
          System.out.println("Error: You must select at least one option");
          return;
        }
        
         // Generate the password
         Random random = new Random();
         StringBuilder password = new StringBuilder();
         for(int i=0; i<len; i++) {
             int index = random.nextInt(sb.length());
             password.append(sb.charAt(index));
         }
         
         System.out.println("\nGenerated Password: " + password.toString());
        sc.close();
    }
}
