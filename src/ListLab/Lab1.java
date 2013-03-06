package ListLab;

import java.util.*;
/**
 *
 * @author dsmith110
 */
public class Lab1 {
    
    public static void main(String[] args) {
        List ex1 = new Vector();
        
        ex1.add("Watch movie");
        ex1.add("Watch tv");
        ex1.add("Watch movie");
        ex1.add("Browse online");
        
        for(int i = 0; i < ex1.size(); i++) {
//            String s = (String)ex1.get(i);
            System.out.println((String)ex1.get(i));
        }
    }
}
