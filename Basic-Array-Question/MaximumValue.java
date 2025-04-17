public class MaximumValue {
    public static void main(String[] arg) {
        int[] arr = { 14, 02, 10, 78, 24, 8, 55 };
        int max = arr[0]; // Assume firdt element is max.
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) { // if arr[i] is greater than max then asigned value to max
                max = arr[i]; // max updated with new value
            }
        }
        System.out.println(max);
    }
}
