package lab4;

import java.util.Scanner;

public class Statue extends Item {
    Scanner xw=new Scanner(System.in);
    Scanner xc=new Scanner(System.in);
    int weight;
    String colour;

    public Statue(){

    }

    public Statue(int weight, String colour) {
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    
    public void EnWeight() {
        System.out.println("Enter weight:");
        weight=xw.nextInt();
    }

    public void EnColour() {
        System.out.println("Enter Colour:");
        colour=xc.nextLine();
    }

    public void input() {
        super.input();
        EnWeight();
        EnColour();
    }

    public void output() {
        System.out.print("statue-");
        super.output();
        System.out.println("Weight:" + weight + "Colour:" + colour);
        
    }
}
