import java.util.Scanner;

public class EvenSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a sentence
        System.out.println("Enter a sentence: ");
        String input = scanner.nextLine();

        // Split the sentence into words
        String[] words = input.split(" ");

        // Print only words with even length
        System.out.println("Words with even length:");
        for (String word : words) {
            if (word.length() % 2 == 0) {
                System.out.println(word);
            }
        }

        scanner.close();
    }
}