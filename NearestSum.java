public class NearestSum {
    public static void main(String[] args) {
        int[] a = {1, 5, 3, 2, 4};
        
        int minSum = Integer.MAX_VALUE;
        int num1 = 0, num2 = 0;

        // Check every pair of elements
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                int sum = a[i] + a[j];

                // Update if the current pair's sum is closer to zero
                if (Math.abs(sum) < Math.abs(minSum)) {
                    minSum = sum;
                    num1 = a[i];
                    num2 = a[j];
                }
            }
        }

        // Output the pair whose sum is closest to 0
        System.out.println(num1 + " + " + num2 + " is nearest to 0");
    }
}