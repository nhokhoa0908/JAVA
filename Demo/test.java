import java.util.Scanner;


public class test {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
            System.out.println("Enter name: ");
            String name = sc.nextLine();
            
            System.out.println("ID: ");
            String ID = sc.nextLine();
             
            System.out.println("Enter 1st num: ");
            int a = sc.nextInt(); 
            System.out.println("Enter 2nd num: ");
            int b = sc.nextInt(); 

            System.out.println("Your name: "+ name);
            System.out.println("Your ID: "+ ID); 
            System.out.println("Sum ="+(a+b));
    }
}