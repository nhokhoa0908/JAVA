
package CarTester.workshop3;

public class Guitar {
    private String SerialNumber;
   private int Price;
   private String Builder;
   private String Model;
   private String BackWood;
   private String TopWood;

   public Guitar(){
       SerialNumber="";
       Price=0;
       Builder="";
       Model="";
       BackWood="";
       TopWood="";
   }

   public Guitar(String SerialNumber,int Price,String Builder,String Model,String BackWood,String TopWood){
        this.SerialNumber = SerialNumber;
        this.Price = Price;
        this.Builder = Builder;
        this.Model = Model;
        this.BackWood = BackWood;
        this.TopWood = TopWood;
   }

   public String getSerialNumber(){
       return SerialNumber;
   }

   public void setSerialNumber(String SerialNumber) {
    this.SerialNumber = SerialNumber;
   }

   public int getPrice(){
       return Price;
   }

   public void setPrice(int Price) {
    this.Price = Price;
   }
   
   public String getBuilder(){
       return Builder;
   }

   public void setBuilder(String Builder) {
    this.Builder = Builder;
   }

   public String getModel(){
       return Model;
   }

   public void setModel(String Model) {
    this.Model = Model;
   }

   public String getBackWood(){
       return BackWood;
   }

   public void setBackWood(String BackWood) {
    this.BackWood = BackWood;
   }

   public String getTopWood(){
       return TopWood;
   }

   public void setTopWood(String TopWood) {
    this.TopWood = TopWood;
   }
   public void CreateSound() {
       System.out.println("SerialNumber:" + SerialNumber);
       System.out.println("Price:" + Price);
       System.out.println("Builder:" + Builder);
       System.out.println("Model:" + Model);
       System.out.println("BackWood:" + BackWood);
       System.out.println("TopWood:" + TopWood);
   }
}
