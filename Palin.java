import java.util.Scanner;

public class Palin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        if (isPrime(num)) {
            System.out.println("Prime");
            System.out.println("Next Palindrome: " + nextPalindrome(num));
        } else {
            System.out.println("Not Prime");
        }
    }

    static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    static int nextPalindrome(int num) {
        while (true) {
            num++;
            if (isPalindrome(num)) return num;
        }
    }

    static boolean isPalindrome(int num) {
        int reversed = 0;
        int original = num;
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return original == reversed;
    }
}