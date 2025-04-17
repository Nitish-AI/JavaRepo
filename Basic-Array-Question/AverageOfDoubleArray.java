public class AverageOfDoubleArray {
    public static void main(String[] args) {
        double[] array = { 11.8, 20.85, 31.87, 43.24, 55.55 }; // array declaration and initialization
        double sum = 0;
        for (int i = 0; i < array.length; i++) { // for loop to iterate through the array
            sum = sum + array[i];
        }
        double avg = sum / array.length;
        System.out.println(avg);
    }
}
