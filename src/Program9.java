import java.util.HashMap;
import java.util.Map;

public class Program9 {
    public static void main(String[] args) {
        Map<String, Integer> people = new HashMap();
        people.put("BMW", 1);
        people.put("Audi", 2);
        people.put("Tesla", 3);
        people.put("Jaguar", 4);
        //Advance For Loop for getting Map list

        for (Map.Entry<String, Integer> people1 : people.entrySet()) {
            System.out.println(people1);
        }
    }
}
