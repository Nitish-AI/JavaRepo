public class SumOfArray {
    public static void main(String[] args) {
        int[] array = { 10, 20, 30, 40, 50 }; // array declaration and initialization
        int sum = 0;
        for (int i = 0; i < array.length; i++) { // for loop to iterate through the array
            sum = sum + array[i];
        }
        System.out.println(sum);
    }
}
