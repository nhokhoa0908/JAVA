import java.util.Scanner;

public class student {
        String code;
        String fullname;
        String phone;

Scanner sc=new Scanner(System.in);  

public student(){
    super();
    addstudent();
}    
public student(String code,String fullname,String phone){
        this.code = code;
        this.fullname = fullname;
        this.phone = phone;
}
        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getFullname() {
            return fullname;
        }

        public void setFullname(String fullname) {
            this.fullname = fullname;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public void info() {
            System.out.println("Code: "+ code + "---"+"Full name:" + fullname + "---" + "Phone:" + phone);
        }
        public void addstudent(){
            System.out.println("Enter code:");
            this.code=sc.nextLine();

            System.out.println("Enter fullname:");
            this.fullname=sc.nextLine();

            System.out.println("Enter phone:");
            this.phone=sc.nextLine();
        }
}
