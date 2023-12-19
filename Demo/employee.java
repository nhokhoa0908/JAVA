public class employee {
    String code;
    String name;
    double salary;

    public employee(String code, String name, double salary) {
        this.code = code;
        this.name = name;
        this.salary = salary;
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
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static double TotalSalary(employee emp[]) {
        
        double s=0;
        for(int i=0; i<emp.length; i++)
        s+=emp[i].salary;
        return s;
    }
    public String toString(){
        return " " + code + " - " + name + " - " + salary;
    }
    
}
