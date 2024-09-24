
import java.util.Scanner;
public class Main {
    public static boolean isPerfectNumber (int number) {
        if (number < 1) {
            return false;
        }
        int sumOfDivisors = 0;
        for (int i = 1; i <= number/2; i++) {

            if ((number % i == 0)){
                sumOfDivisors += i;
            }
        }
        return sumOfDivisors == number;


    }
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(isPerfectNumber(number));

        }
    }
