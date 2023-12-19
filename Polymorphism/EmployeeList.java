package Polymorphism;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class EmployeeList {
    private ArrayList<Employee> listemp = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
    public EmployeeList(){
        super();
    }

    int find(String aCode){
        for( int i = 0; i< listemp.size(); i++){
            if(aCode.equals(listemp.get(i).getCode()))
             return i;
            }
        return -1;    
    }

    public void addfull() {
        String newCode, newName, newPhone;
        int newAbsent;

        int pos;
        do{
            System.out.println("Enter the employee's code: ");
            newCode = sc.nextLine().toUpperCase();
            pos = find(newCode);
            if(pos >= 0)
                System.out.println("\tThiscode extisted");
        } while(pos>=0);

        System.out.println("Enter the Employee's name: ");
        newName = sc.nextLine().toUpperCase();
        System.out.println("Enter the Employee's phone: ");
        newPhone = sc.nextLine();
        System.out.println("Enter the Employee's absent: ");
        newAbsent = Integer.parseInt(sc.nextLine());
        listemp.add(new Emp_Fulltime(newCode, newName, newPhone, newAbsent));
        System.out.println("New Employee have been added");
    }

    public void addpart() {
        String newCode, newName, newPhone;
        int newPresent;

        int pos;
        do{
            System.out.println("Enter the employee's code: ");
            newCode = sc.nextLine().toUpperCase();
            pos = find(newCode);
            if(pos >= 0)
                System.out.println("\tThiscode extisted");
        } while(pos>=0);

        System.out.println("Enter the Employee's name: ");
        newName = sc.nextLine().toUpperCase();
        System.out.println("Enter the Employee's phone: ");
        newPhone = sc.nextLine();
        System.out.println("Enter the Employee's present: ");
        newPresent = Integer.parseInt(sc.nextLine());
        listemp.add(new Emp_Parttime(newCode, newName, newPhone, newPresent));
        System.out.println("New Employee have been added");
    }

    public void print() {
        if(listemp.size()==0){
            System.out.println("Empty list!");
            return;
        }
        else{
            for(int i=0;i<listemp.size();i++){
             String s=listemp.get(i).toString();
             System.out.println(s);
             } 
         }
        
    }

    public void sortSalary() {
        Collections.sort(listemp,new Comparator<Employee>(){

            @Override
            public int compare(Employee o1, Employee o2) {
                Employee e1=(Employee)o1;
                Employee e2=(Employee)o2;
                int salary1;
                int salary2;

                if(o1 instanceof Emp_Fulltime){
                    salary1=((Emp_Fulltime)o1).SumSalary();
                }
                else salary1=((Emp_Parttime)o1).SumSalary();

                if (o2 instanceof Emp_Fulltime) {
                    salary2=((Emp_Fulltime)o2).SumSalary();
                }
                else salary2=((Emp_Parttime)o2).SumSalary();
                
                int check= salary1-salary2;
                if(check<0) return -1;
                return 1;
            }
            
        });
        print();
    }

    public void update() {
        String code1;
        System.out.println("Enter code need to update: ");
        code1=sc.nextLine().toUpperCase();
        int i=find(code1);
        if(listemp.get(i) instanceof Emp_Fulltime){
            listemp.remove(i);
            String newName,newPhone;
            int newabsent;
            System.out.println("enter the Employee's name: ");
            newName =sc.nextLine().toUpperCase();
            System.out.println("enter the Employee's phone: ");
            newPhone=sc.nextLine();
            System.out.println("enter the Employee's absent: ");
            newabsent=Integer.parseInt(sc.nextLine());
            listemp.add(i,new Emp_Fulltime(code1, newName, newPhone, newabsent));
        }
        else if(listemp.get(i) instanceof Emp_Parttime){
            listemp.remove(i);
            String newName,newPhone;
            int newpresent;
            System.out.println("enter the Employee's name: ");
            newName =sc.nextLine().toUpperCase();
            System.out.println("enter the Employee's phone: ");
            newPhone=sc.nextLine();
            System.out.println("enter the Employee's present: ");
            newpresent=Integer.parseInt(sc.nextLine());
            listemp.add(i,new Emp_Parttime(code1, newName, newPhone, newpresent));
            
        }
        else{
            System.out.println("Code is not exist!!");
        }
        
    }

    public int remove(){
        String newCode;
        int pos=0;
        System.out.println("enter employee's code: ");
        newCode=sc.nextLine().toUpperCase();
        pos=find(newCode);
        if(pos>=0){
            listemp.remove(pos);
            System.out.println("Removed");
        }
        
        else {
            System.out.println("code is not existed");
            return 0;
        }
        return 1;
    }
}

