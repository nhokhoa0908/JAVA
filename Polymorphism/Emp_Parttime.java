package Polymorphism;

public class Emp_Parttime extends Employee{
    final private int daily_wage=40;
    private int present;

    public Emp_Parttime(String code, String name, String phone, int present) {
        super(code, name, phone);
        this.present = present;
    }

    public int getDaily_wage() {
        return daily_wage;
    }

    public int getPresent() {
        return present;
    }

    public void setPresent(int present) {
        this.present = present;
    }
    
    public int SumSalary(){
        return present*daily_wage;
    }

    public String toString() {
        return "Parttime-"+ code + "-" + name + "-" + phone +"-"+ SumSalary();
    }
    
}
