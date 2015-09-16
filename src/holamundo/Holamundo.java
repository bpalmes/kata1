/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

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
        p1 = new Person("Enrique","Gómez",null);
        System.out.println(p1.getFullName());
        p1.getAge();
        p1.helloWorld();
    }
}
