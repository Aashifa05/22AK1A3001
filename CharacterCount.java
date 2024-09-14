public class CharacterCount{
    public static void main(String[] args) {
        String input = "Raja";
        input = input.toLowerCase();

        int[] count = new int[256];  // Array to store character frequencies

        for (char c : input.toCharArray()) {
            count[c]++;  // Increment count for each character
        }

        // Display the result
        for (char c : input.toCharArray()) {
            if (count[c] != 0) {
                System.out.println(c + " repeated " + count[c] + " times");
                count[c] = 0;  // Reset to 0 to avoid duplicate printing
            }
        }
    }
}