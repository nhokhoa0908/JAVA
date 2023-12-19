package lab4;

import java.util.Scanner;

public class Vase extends Item {
    Scanner sm=new Scanner(System.in);
    Scanner sc=new Scanner(System.in);
    int height;
    String material;

    public Vase(){

    }

    public Vase(int height, String material, int value, String creator) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }

    public void EnHeight() {
        System.out.println("Enter height:");
        height=sc.nextInt();
    }

    public void EnMaterial() {
        System.out.println("Enter material:");
        material=sm.nextLine();
    }
    
    public void input() {
        super.input();
        EnHeight();
        EnMaterial();
    }

    public void output() {
        System.out.print("vase-");
        super.output();
        System.out.println("Height:" + height + "Material:" + material);
    }

}
