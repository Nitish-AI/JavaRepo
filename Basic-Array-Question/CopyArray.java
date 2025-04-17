public class CopyArray {
    public static void main(String[] args) {
        int[] original = { 12, 23, 34, 45, 56 };
        int[] copy = new int[original.length]; // length assigned to copy array as same original array
        for (int i = 0; i < original.length; i++) { // for loop to copy elements from original array to copy array
            copy[i] = original[i];
        }
        System.out.println("Elements are copied from original array to copy array");
        for (int i = 0; i < copy.length; i++) { // printing elements of copy array
            System.out.print(copy[i] + " ");
        }
    }
}
