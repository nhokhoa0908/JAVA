package lab4;

import java.util.Scanner;

public class Painting extends Item {
    Scanner sc3=new Scanner(System.in);
    Scanner sc=new Scanner(System.in);
    Scanner xh=new Scanner(System.in);
    Scanner xw=new Scanner(System.in);
    int height;
    int width;
    boolean isWatercolour;
    boolean isFramed;
    int choice=0;
    
    public Painting(){
        
    }

    public Painting(int height, int width, boolean isWatercolour, boolean isFramed, int value, String creator) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isWatercolour() {
        return isWatercolour;
    }

    public void setWatercolour(boolean isWatercolour) {
        this.isWatercolour = isWatercolour;
    }

    public boolean isFramed() {
        return isFramed;
    }

    public void setFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }

    public void EnHeight() {
        System.out.println("Enter height:");
        height=xh.nextInt();
    }

    public void EnWidth() {
        System.out.println("Enter width:");
        width=xh.nextInt();
    }

    public void EnisWatercolour() {
        System.out.println("Is it WaterColour(true,false):");
        isWatercolour =Boolean.parseBoolean(sc3.nextLine());
        }
    
    public void EnisFramed() {
        System.out.println("Is it Framed(true,false):");
        isFramed=Boolean.parseBoolean(sc3.nextLine());
        }
    
    public void input() {
        super.input();
        EnHeight();
        EnWidth();
        EnisWatercolour();
        EnisFramed();
    }

    public void output() {
        System.out.print("painting-");
        super.output();
        System.out.println("PAINTING-"+"Height:"+height+"Width:"+width+"Water colour:"+ isWatercolour+"Framed:"+ isFramed);
    }
}

