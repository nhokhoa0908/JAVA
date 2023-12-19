package lab4;

import java.util.Scanner;

public class antiqueShop {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            Itemlist obj=new Itemlist();
            int flag=0;
            int choice=0;
            do{
                System.out.println("1. add a new vase");
                System.out.println("2. add a new statue");
                System.out.println("3. add a new painting");
                System.out.println("4. display all items");
                System.out.println("5. find the items by the creator ");
                System.out.println("6. update the item by its index");
                System.out.println("7. remove the item by its index");
                System.out.println("8. display the list of item's type ");
                System.out.println("9. sorts items in ascending order based on their values ");
                System.out.println("10. exit");
                System.out.println("input your choice:");
                do{
                try{
                choice=Integer.parseInt(sc.nextLine());
                flag =1;
                }
                catch(Exception ec){
                    System.out.println("you entered wrong format");
                }
                } while (flag ==0);
                flag=0;
                switch(choice){
                    case 1:
                        Item tmp=new Vase();
                        tmp.input();
                        if(obj.addItem(tmp)){
                            System.out.println("added");
                        }
                        break;
                    case 2:
                        Item tmp1=new Statue();
                        tmp1.input();
                        if(obj.addItem(tmp1)){
                            System.out.println("added");
                        }
                        break;
                    case 3:
                        Item tmp2=new Painting();
                        tmp2.input();
                        if(obj.addItem(tmp2)){
                            System.out.println("added");
                        }
                        break;
                    case 4:
                        obj.displayAll();
                        break;
                    case 5:
                        System.out.println("enter creator:");
                        Scanner sc1=new Scanner(System.in);
                        String creator;
                        creator = sc1.nextLine();
                        Item timkiem= obj.findItem(creator);
                        if(timkiem != null){
                            timkiem.output();
                        }
                        else System.out.println("not found object!!");
                        break;
                    case 6:
                        System.out.println("enter update index:");
                        int index = 0;
                        Scanner sc3=new Scanner(System.in);
                        do{
                        try{
                        index=Integer.parseInt(sc3.nextLine());
                        flag =1;
                        }
                        catch(Exception ec){
                        System.out.println("you entered wrong format");
                        }
                        } while (flag ==0);
                        
                        obj.updateItem(index);
                        break;
                    case 7:
                        System.out.println("enter remove index:");
                        int index1=Integer.parseInt(sc.nextLine());
                        obj.removeItem(index1);
                        break;
                    case 8:
                        System.out.println("enter type(vase,statue,painting):");
                        Scanner sc2 =new Scanner(System.in);
                        String type= sc2.nextLine();
                        obj.displayItemByType(type);
                        break;
                    case 9:
                        obj.sortItem();
                        break;
                    case 10:
                        choice =10;
                        break;
                    default:
                        break;
                        
                }
            System.out.println("===================================");
            }   while(choice !=10);
            
    }
    
}
