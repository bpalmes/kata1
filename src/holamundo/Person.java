/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;
import java.util.Date;
/**
 *
 * @author usuario
 */
public class Person {

    private final String name;
    private final String surname;
    private final Date birthday;
    private static  final long MILLESECOND_PER_YEAR = (long) (1000 * 60*60*24*365.25) ;
    
    public Person (String n, String s, Date d){
        name =n;
        surname = s;
        birthday = d;
    }
    
    public String getName(){
        return name;
    }
    public String getFullName(){
        return(name + " "+ surname +" " + getAge());
    }
    public int getAge(){
        Date today = new Date();
        return (int) getMillis(today.getTime()- birthday.getTime());
    }
    private long getMillis(long milli){
        return milli/MILLESECOND_PER_YEAR;
    }
    
}
