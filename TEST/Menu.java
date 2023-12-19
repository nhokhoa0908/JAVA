package TEST;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu extends ArrayList<String> {

    public int getChoice(){
        int result = 0;
        Scanner sc = new Scanner(System.in);
        if(this.size()>0){
            for(int i=0; i<this.size(); i++)
                System.out.println((i+1) + "-" + this.get(i));
            System.out.print("Please select an operation: ");
            result = Integer.parseInt(sc.nextLine());   
        }
        return result;
    }
}
