
import java.util.Scanner;

public class GetIntegers {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int num, total = 0;

        // Loop should start here
        for(int x=0; x<10; x++){
            System.out.println("Enter any number x: ");
            num = keyboard.nextInt();
            total += num;

        }

        System.out.println(total);

        // Loop should end here

        System.out.println("The total of all 10 numbers is " + total);

    }
}
