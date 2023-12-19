package Demo2;

public class Employee implements Comparable<Employee> {
    String ID;
    String Name;
    int salary;
    
    public Employee(String iD, String name, int salary) {
        ID = iD;
        Name = name;
        this.salary = salary;
    }

    public String getID() {
        return ID;
    }

    public void setID(String iD) {
        ID = iD;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString(){
        return ID+"-"+Name+"-"+salary;
    }

    @Override
    public int compareTo(Employee t) {
        return ID.compareTo(t.getID());
    }
    
    
}
