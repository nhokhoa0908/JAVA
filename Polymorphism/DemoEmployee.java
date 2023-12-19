package Polymorphism;

public class DemoEmployee {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.add("Add new a Fulltime employee");
        menu.add("Add new a Parttime employee");
        menu.add("Print out employee list");
        menu.add("Print out employee list in ascending order of salary");
        menu.add("Update the employee information based on the code the user entered");
        menu.add("Remove employee out of list base on code");
        menu.add("Quit");
        int choice;
        EmployeeList listobj = new EmployeeList();
        do{
            System.out.println("\nEMPLOYEE MANAGER");
            choice = menu.getChoice();
            switch(choice){
                case 1:
                    listobj.addfull();
                    break;
                case 2:
                    listobj.addpart();
                    break;    
                case 3:
                    listobj.print();
                    break;  
                case 4:
                    listobj.sortSalary();
                    break;  
                case 5:
                    listobj.update();
                    break;
                case 6:
                    listobj.remove();
                    break; 
                case 7:
                    System.out.println("Quit!!!");;
                    break;      
            }
        }while ((choice>=1) && choice < 8);
    }
}
