package src.main.java.JavaEight;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jordan on 6/14/2017.
 */
public class MethodReferenceTester {

    /**
     * Method references help to point to methods by their names. A method reference
     * is described using :: (double colon) symbol. A method reference can be used to point the following types
     * of methods --
     *
     * static methods
     * instance methods
     * contructors using new operator (TreeSet::new)
     */

    public static void main(String[] args) {
        List names = new ArrayList();

        names.add("Mahesh");
        names.add("Suresh");
        names.add("Ramesh");
        names.add("Naresh");
        names.add("Kalpesh");

        names.forEach(System.out::println);
    }


}
