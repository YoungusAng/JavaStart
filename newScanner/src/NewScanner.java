import java.util.Scanner;

public class NewScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();

        int sum = x + y;

        System.out.println("sum =" + sum);



    }
}
