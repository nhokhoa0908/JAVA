import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapExample02 {
    public static void main(String[] args) {
        //khoi tao map
        TreeMap<String, String> map = new TreeMap<>();
        String key;
        //them cac phan tu vao map
        map.put("J", "Java");
        map.put("C", "C++");
        map.put("P", "PHP");
        map.put("Py", "Python");
        //show Treemap
        Iterator<String> itr = map.keySet().iterator();
        while (itr.hasNext()) {
            key=itr.next();
            System.out.println(key+"-"+map.get(key));
        }
    }
    
}