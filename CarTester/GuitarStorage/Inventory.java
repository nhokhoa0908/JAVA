
package CarTester.GuitarStorage;


public class Inventory {
        Guitar[] list ;
    int n=0;
    final int max=100;

    public Inventory(){
        list=new Guitar[max];
    }

    public void add(Guitar gt) {
        list[n]=gt;
        n++;
    }

    public Guitar SearchGuitar(String SerialNumber){
        Guitar gt=null;
        if(n==0) return null;
        for(int i=0;i<n;i++){
            if(list[i].getSerialNumber().equals(SerialNumber))
            gt= list[i];
        }
        return gt;
    }

}
