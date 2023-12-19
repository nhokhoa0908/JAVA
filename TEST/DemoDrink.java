package TEST;

public class DemoDrink {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.add("Add new a drink");
        menu.add("Printing out items with the highest unit price");
        menu.add("Printing the list in ascending order based on volumes then prices");
        menu.add("Update a soft drink based on a name inputted");
        menu.add("Delete drink out of list base on company");
        menu.add("Quit");
        int choice;
        DrinkList listobj = new DrinkList();
        do{
            System.out.println("\nDrink MANAGER");
            choice = menu.getChoice();
            switch(choice){
                case 1:
                    listobj.add();
                    break;    
                case 2:
                    listobj.print();
                    break;  
                //case 3:
                //    listobj.sortSalary();
                //    break;  
                case 4:
                    listobj.update();
                    break;
                case 5:
                    listobj.remove();
                    break; 
                case 6:
                    System.out.println("Quit!!!");;
                    break;      
            }
        }while ((choice>=1) && choice < 8);
    }
    
}
