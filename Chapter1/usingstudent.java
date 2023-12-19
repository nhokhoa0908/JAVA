public class usingstudent {
        public static void main(String[] args) {
            
            student[] liststudent=new student[30];
            
        liststudent[0]=new student("SE169999","Nguyen Ngoc Trinh","999988882222");
        
         
        liststudent[1]=new student("SE160000","Nguyen Ngoc Ngan","666777333");
        
        liststudent[2]=new student("SE163399", "Nguyen Van Ba", "090990569");
     
        
        for (int i=0;i<9999;i++){
            liststudent[i].info();
            System.out.println("--------------------------");
        }
        }
    }

