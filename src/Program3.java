import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int b;
        System.out.println("Enter the range :");
        b = scan.nextInt();
        int a[] = new int[b];
        System.out.println("Enter the value of array :");
        for (int i = 0; i < b; i++) {
            a[i] = scan.nextInt();
        }
        System.out.println("Reverse value of Array:");
        for (int i = b - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }
        scan.close();
    }
}
