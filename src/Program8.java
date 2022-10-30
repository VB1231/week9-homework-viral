import java.util.HashSet;
import java.util.Set;

public class Program8 {
    public static void main(String[] args) {

        Set<Integer> list = new HashSet();
        list.add(4);
        list.add(7);
        list.add(8);
        list.add(11);

        int a;
        //Iterator use like For loop
        //   Iterator itr = list.iterator();
        //  System.out.println(list.size());
        //int [] array = list.toArray(list.size());
        for (int i = 1; i <= 10; i++) {
            if (list.contains(i))
                System.out.println("Valid number   :" + i);
            else  System.out.println("Invalid number");
        }
    }
}
