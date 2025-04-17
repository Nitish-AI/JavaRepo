public class FindElement {
    public static void main(String[] arg) {
        int[] arr = { 14, 02, 10, 78, 24, 8, 55 };
        int find = 78; // Assume find element is 78.
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == find) {
                System.out.println(find + " Element found at index " + i);
                found = true;
                break; // out of loop when element found
            }
        }
        if (found != true) {
            System.out.println(find + " Element not found. ");
        }
    }
}
