package TEST;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DrinkList {
    private  ArrayList<Drink>  listd = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public DrinkList(){
        super();
    }

    int find (String aName){
        for(int i=0; i<listd.size(); i++)
            if(aName.equals(listd.get(i).getName()))
            return i;
        return -1;    
    }
    int findC (String aCompany){
        for(int i=0; i<listd.size(); i++)
            if(aCompany.equals(listd.get(i).getCompany()))
            return i;
        return -1;    
    }

    public void add() {
        String newCode, newName, newMake, newCompany;
        double newVolume, newPrice;

            int pos;
            do{
                System.out.print("Enter the people's code:");
                newCode = sc.nextLine().toUpperCase();
                pos = find(newCode);
                if(pos >= 0)
                    System.out.println("\tThis code existed!");
            }
            while (pos >=0);
                System.out.print("Enter the Drink's name:");
                newName = sc.nextLine();
                System.out.print("Enter the Drink's make:");
                newMake = sc.nextLine();
                System.out.print("Enter the Drink's volume:");
                newVolume = Double.parseDouble(sc.nextLine());
                System.out.print("Enter the Drink's price:");
                newPrice= Double.parseDouble(sc.nextLine());
                System.out.print("Enter the Drink's company:");
                newCompany= sc.nextLine();
                listd.add(new Drink(newCode, newName, newMake, newVolume, newPrice, newCompany));
                System.out.println("New drink have been added");
    }

    public int remove(){
        String newCompany;
        int pos;
        System.out.print("Enter the drink's company:");
                newCompany = sc.nextLine();
                pos = findC(newCompany);
                if(pos >= 0){
                    listd.remove(pos);
                    System.out.println("Deleted");
                }
                else{
                    System.out.println("Company is not exist");
                    return 0;
                }
        return 1;        
    }

    public void update(){
        String newCode,newMake, newCompany;
        double newVolume, newPrice;
        String name1;
        System.out.println("Enter a name want to update:");
        name1 = sc.nextLine();
        int i=find(name1);

        if(listd.get(i) instanceof Drink){
            listd.remove(i);
                System.out.print("Enter the Drink's code:");
                newCode = sc.nextLine();
                System.out.print("Enter the Drink's make:");
                newMake = sc.nextLine();
                System.out.print("Enter the Drink's volume:");
                newVolume = Double.parseDouble(sc.nextLine());
                System.out.print("Enter the Drink's price:");
                newPrice= Double.parseDouble(sc.nextLine());
                System.out.print("Enter the Drink's company:");
                newCompany= sc.nextLine();
                listd.add(new Drink(newCode, name1, newMake, newVolume, newPrice, newCompany));
                System.out.println("New drink have been added");
        }else{
            System.out.println("Name is not exist!!");
        }
    }

    public void print() {
        if(listd.size()==0){
            System.out.println("List is empty");
            return;
        }
        else{
            for(int i=0;i<listd.size();i++){
            String s=listd.get(i).toString();
            System.out.println(s);
            }
        }
    }

}
