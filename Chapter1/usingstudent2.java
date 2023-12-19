import java.util.Scanner;

public class usingstudent2 {
    public static void main(String[] args) {
        Scanner sc1 =new Scanner(System.in);
        student[] liststudent=new student[30];
        int n;
        System.out.println("Enter number of students:");
        n=Integer.parseInt(sc1.nextLine());

        for(int i=0;i<n;i++){
            liststudent[i]=new student();
        }
        
        System.out.println();
        for(int i=0;i<n;i++){
            liststudent[i].info();
            System.out.println("------------------");
        }


    }
}
