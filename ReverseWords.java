public class ReverseWords {

    public static void main(String[] args) {
        String input = "My name is Raja";
        String output = reverseEachWord(input);
        System.out.println(output);
    }

    public static String reverseEachWord(String input) {
        String[] words = input.split(" ");
        StringBuilder reversedString = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();
            reversedString.append(reversedWord).append(" ");
        }

        // Remove the trailing space
        return reversedString.toString().trim();
    }
}