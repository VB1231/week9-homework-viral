import java.util.ArrayList;
import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        ArrayList<String> colour = new ArrayList();
        colour.add("Red");
        colour.add("Blue");
        colour.add("Green");
        colour.add("Orange");
        colour.add("Purple");

        for (String s : colour) {
            System.out.println(s);
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter index number which element you want to see :");
        int a = scan.nextInt();
        System.out.println(colour.get(a));
    }
}
