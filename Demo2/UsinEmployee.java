package Demo2;

import java.util.ArrayList;
import java.util.Collections;

public class UsinEmployee {
    public static void main(String[] args) {
        ArrayList listemp=new ArrayList<>();
        Employee e1=new Employee("SE123","Nguyen Hoai Bao", 5000);
        Employee e2=new Employee("SE333","Nguyen Tien Linh", 9000);
        Employee e3=new Employee("SE444","Tran Minh Vuong", 6000);
    

    listemp.add(e1);
    listemp.add(e2);
    listemp.add(e3);

    Collections.sort(listemp);

    System.out.println("Employee list:"+listemp);
    }

}
