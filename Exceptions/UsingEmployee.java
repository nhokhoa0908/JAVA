package Exceptions;

import java.util.Scanner;

public class UsingEmployee {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String code;
    String fullname;
    int age=0;
    String address;
    long salary=0;

    boolean check=false;
    do{
        System.out.println("Enter code:");
        code=sc.nextLine();

        if(code.length()==0)
            System.out.println("Employee code cannot be emty");
        else if(!code.matches("^SE\\d{6}$"))
            System.out.println("You entered the wrong employee code format");
        else 
            check=true;
           
    }while (check==false);



    check=false;
    do{
        System.out.println("Enter fullname:");
        fullname=sc.nextLine();

            if(fullname.length()==0)
            System.out.println("Employee fullname cannot be empty");
            else if (fullname.length()<4)
            System.out.println("Fullname with at least 4 chracters!!!");
            else
            check=true;
        }while(check==false);



        check=false;
        do{
            System.out.println("Enter address:");
            address=sc.nextLine();

            if(address.length()==0)
                System.out.println("Employee address cannot be empty");
            else if(address.length()<20)
                System.out.println("Employee address with at least 20 characters");
            else    
                check=true;    
        }while (check==false);


        check=false;
        do{
            System.out.println("Enter salary");
            try{
                salary=Long.parseLong(sc.nextLine());
                if(salary<5000000||salary>20000000)
                System.out.println("Salary from 5000000 to 20000000");
                check=true;
        }catch(Exception ex){
            System.out.println("You entered the wrong employee salary format");
            }
        }while (check==false);
        
        Employee emp=new Employee(code, fullname, age, address, salary);
        System.out.println(emp);
    }
}
