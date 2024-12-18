
import java.util.*;

public class Positive_integer_or_not {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER THE INTEGER NUMBER: ");
        int number = scanner.nextInt();
        if (number >=0) {
            System.out.println("It is a Positive Integer: " + number);

        }
        scanner.close();


    }
}
