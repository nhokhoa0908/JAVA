package Polymorphism;

public class Employee {
    String code;
    String name;
    String phone;

    public Employee(String code, String name, String phone) {
        this.code = code;
        this.name = name;
        this.phone = phone;
    }

    public Employee() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int SumSalary(){
        return 0;
    }
    
    public String toString() {
        return code + "-" + name + "-" + phone;
    }
}
