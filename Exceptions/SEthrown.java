package Exceptions;

import java.util.Scanner;

public class SEthrown {
    public String inpuString()  throws Exception {
        String pattern="SE\\d{3}";
        String s="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter student number:");
        s=sc.nextLine();
        if(!s.matches(pattern))
            throw new Exception();
        return s;
    }
    public static void main(String[] args) {
        SEthrown obj=new SEthrown();
        boolean cont=false;
        do{
            try{
                String s=obj.inpuString();
                System.out.println("The string is: "+ s);
                cont=false;
            }catch(Exception e){
                System.out.println("The string is invalid");
                cont=true;
            }
        }while(cont);
    }
}
