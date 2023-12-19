
package CarTester.GuitarStorage;

import java.util.Scanner;
public class usingInventory {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String serinew;
        Inventory objin=new Inventory();

        Guitar objgt1=new Guitar("objgt1");
        Guitar K29=new Guitar("K29");
        Guitar GG=new Guitar("GG");
        Guitar SS=new Guitar("SS");
        Guitar SE=new Guitar("SE");
        objin.add(objgt1);
        objin.add(K29);
        objin.add(GG);
        objin.add(SS);
        objin.add(SE);

        System.out.println("Enter seriNumber:");

        serinew=sc.nextLine();

        Guitar gtsearch=objin.SearchGuitar(serinew);

        if(gtsearch!=null)
            gtsearch.CreateSound();
        else
            System.out.println("Not found");    
    }
}
