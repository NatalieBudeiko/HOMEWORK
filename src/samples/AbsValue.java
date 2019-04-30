// just a package name
package samples;

// this adds a scanner, without it the code will not work
import java.util.Scanner;

// public class name. public can be used by anyone
public class AbsValue {

    // public point of entry
    public static void main(String[] args) {
        // type long - variable name (some number) = assignment of some value
        // new scanner is a new object. next.Long is a method and returns a long from console
        long num = new Scanner(System.in).nextLong();

        //System.out.println(num);
        // condition,
        if (num <= 0) {
            // prints a number multiplied ny -1 to console
            System.out.println(-num);
        }

        if (num > 0) {
            // this method prints a number entered to console back to console again
            System.out.println(num);
        }


        System.out.println(num < 0 ? -num : num);


        //System.out.println(Math.abs(num));

    }
}
