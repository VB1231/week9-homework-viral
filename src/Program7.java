import java.util.ArrayList;

public class Program7 {
    public static void main(String[] args) {
        ArrayList<String> c = new ArrayList();
        c.add("Jubeeli");
        c.add("Metropolitan");
        c.add("Bekarloo");
        for (String s : c) {
            System.out.println(s);
        }
        System.out.println(c.isEmpty());
    }
}
