package Polymorphism;

public class Emp_Fulltime extends Employee {
    final private int basic_salary=1500;
    private int absent;
    
    public Emp_Fulltime(String code, String name, String phone, int absent) {
        super(code, name, phone);
        this.absent = absent;
    }

    public int getBasic_salary() {
        return basic_salary;
    }

    public int getAbsent() {
        return absent;
    }

    public void setAbsent(int absent) {
        this.absent = absent;
    }

    public int SumSalary(){
        return basic_salary - (absent*50);
    }

    public String toString() {
        return "Fulltime-"+ code + "-" + name + "-" + phone +"-"+ SumSalary();
    }
    
}
