package StudentsManager;

import java.util.Scanner;

public class Inputer {
    public static Scanner sc = new Scanner(System.in);
    
    public static int InputerInt(String msg, int min, int max){
        if(min>max){
            int t=min; min=max; max=t;
        }
        int data;
        do{
            System.out.print(msg);
            data = Integer.parseInt(sc.nextLine());
        }
        while (data<min || data>max);
        return data;
    }

    public static String InputStr (String msg){
        System.out.println(msg);
        String data = sc.nextLine().trim();
        return data;
    }

    public static String InputNonBlankStr (String msg){
        String data;
        do{
            System.out.print(msg);
            data = sc.nextLine().trim();
        }
        while (data.length()==0);
        return data;
    }

    public static String InputPattern (String msg, String pattern) {
        String data;
        do{
            System.out.print(msg);
            data = sc.nextLine().trim(); 
        }
        while (!data.matches(pattern));
        return data;
        }
    }

