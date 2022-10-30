import java.util.ArrayList;
import java.util.List;

public class Program10 {
    public static void main(String[] args) {
        ArrayList<String> c = new ArrayList();
        c.add("Jubeeli");
        c.add("Metropolitan");
        c.add("Bekarloo");
        List<String> s = new ArrayList<String>();
        s.add("Baker Street ");
        s.add("Charing Cross ");
        s.add("Oxford Circus");
        s.add("Edware Road");
        // Print the list
        // System.out.println("Bakoor line Stations for ZONE 1"+s);

        List<String> s1 = new ArrayList<String>();
        s1.add("Bond Street ");
        s1.add("Green Park");
        s1.add("Charing Cross");
        s1.add("Baker Street");
        // Print the list
        //System.out.println("Jubilee  line Stations for ZONE 1"+s1);

        List<String> s2 = new ArrayList<String>();
        s2.add("Bank ");
        s2.add("Liverpool street");
        s2.add("Tottenham Street ");
        s2.add("Mile End");
        s2.add("Holborn");
        s2.add("Chancery Lane");
        s2.add("Queens way");
        s2.add("Lancery Gate");
        // Print the list
        // System.out.println("Central line Stations for ZONE 1"+s2);
        for (String m : c) {
            if (m.matches("Bekarloo"))
                System.out.println(m + " " + s);
            else if (m.matches("Jubeeli"))
                System.out.println(m + " " + s1);
            else System.out.println(m + " " + s2);

        }
    }
}
