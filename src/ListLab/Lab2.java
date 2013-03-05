package ListLab;

import java.util.*;

/**
 *
 * @author dsmith110
 */
public class Lab2 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("a", "Dan");
        Employee emp2 = new Employee("b", "John");
        Employee emp3 = new Employee("c", "Jake");
        
        List<Employee> ex2 = new ArrayList<Employee>();
        ex2.add(emp1);
        ex2.add(emp2);
        ex2.add(emp3);
        
        for(Employee s : ex2) {
            System.out.println(s.getName());
        }
    }
}
