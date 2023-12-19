public class employeeUse {
    public static void main(String[] args) {
        employee[] emp=new employee[3];

        emp[0]=new employee("SE00001", "Le Binh Phuong", 500);
        emp[1]=new employee("SE00002", "Ly Thu Thao", 600);
        emp[2]=new employee("SE00003", "Le Minh Thanh", 700);

        double total=employee.TotalSalary(emp);
        System.out.println("Total salary :" + total);
        System.out.println("------------------------");

        System.out.println(emp[0]);
        System.out.println(emp[1]);
        System.out.println(emp[2]);
    }
}
