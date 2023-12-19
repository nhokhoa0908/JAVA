
package CarTester.GuitarStorage;

public class Guitar {
    String SerialNumber;
    
    public Guitar(){
       SerialNumber="";
    }
    
    public Guitar(String SerialNumber){
        this.SerialNumber = SerialNumber;
    }
    public String getSerialNumber() {
        return SerialNumber;
    }

    public void setSerialNumber(String SerialNumber) {
        this.SerialNumber = SerialNumber;
    }
    
    public void CreateSound() {
       System.out.println("SerialNumber:" + SerialNumber);
    }
}
