package DTO;

public class University extends Organization{
    public String name;

    public University() {
    }

    public University(String name, int size) {
        super(size);
        this.name = name;
    }

    @Override
    void communicateByTool() {
        System.out.println("in the usniversity,people communacate by voice");
    }

    public void enroll(){
        System.out.println("The registration for enrollment is only valid when the University has received all enrollment documents and enrollment fees");
    }

    public void educate(){
        System.out.println("provide education at university standard");
    }

    @Override
    public String toString() {
        return "encourage the advancement and development of knowledge”;

    }

}
