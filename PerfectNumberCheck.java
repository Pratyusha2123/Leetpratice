import java.util.Scanner;

public class PerfectNumberCheck {
    public static int factorial(int digit) {
        int fact = 1;
        for (int i = 1; i <= digit; i++) {
            fact *= i;
        }
        return fact;
    }
    public static int isPerfect(int n) {
        int temp = n;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += factorial(digit);
            n = n / 10;
        }

        return (temp == sum) ? 1 : 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = isPerfect(num);

        if (result == 1) {
            System.out.println(num + " one is a perfect number");
        } else {
            System.out.println(num + " zero is not a perrfect number");
        }

        sc.close();
    }
}
