/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;
/**
 *
 * @author usuario
 */
public class Holamundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person p1;
        Calendar f1;
        f1 = GregorianCalendar.getInstance();
        f1.set(1968,3,4);
        p1 = new Person("Enrique","Gómez",f1);
        System.out.println(p1.getFullName());
        p1.getAge();
        p1.helloWorld();
    }
}
