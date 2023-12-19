package lab4;

import java.util.Scanner;

public class Item {
    Scanner xe=new Scanner(System.in);
    Scanner xl=new Scanner(System.in);
    public int value;
    public String creator;

    public Item(){    
    }

    public Item(int value, String creator, int value, String creator) {
        this.value = value;
        this.creator = creator;
    }
    
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public String getCreator() {
        return creator;
    }
    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void EnValue() {
        System.out.println("Enter value:");
        value=xe.nextInt();
    }

    public void EnCreator() {
        System.out.println("Enter creator:");
        creator=xl.nextLine();
    }

    public void input(){
        EnValue();
        EnCreator();
    }
    
    public void output() {
        System.out.print("Value:" + value + "Creator:" + creator);
    }
    
}
