package ListLab;

import java.util.*;
/**
 *
 * @author dsmith110
 */
public class Lab3 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("a", "Dan");
        Employee emp2 = new Employee("b", "John");
        Employee emp3 = new Employee("c", "Jake");
        Dog dog = new Dog("Fido", "d123");
        
        List ex2 = new ArrayList();
        ex2.add(emp1);
        ex2.add(emp2);
        ex2.add(emp3);
        ex2.add(dog);

        for (Object obj : ex2) {
            if(obj instanceof Employee) {
//                Employee e = (Employee)s;
                System.out.println(((Employee)obj).getName());
            } else if(obj instanceof Dog) {
//                Dog d = (Dog)s;
                System.out.println(((Dog)obj).getRabiesId());
            }
        }
        
    }
}
