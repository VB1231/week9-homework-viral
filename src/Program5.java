import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Program5 {
    public static void main(String[] args) {

        Set<String> list = new HashSet();
        list.add("Prime");
        list.add("Testing");
        list.add("Java");
        list.add("Selenium");
        list.add("Java Script");
        int a;
        //Iterator use like For loop
        Iterator itr = list.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
