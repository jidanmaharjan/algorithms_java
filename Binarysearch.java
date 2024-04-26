import java.util.Arrays;

public class Binarysearch {

    public static void main(String[] args) {
        int[] numbers = { 1, 5, 15, 32, 45, 90, 115, 235, 456, 22, 63, 7 };
        Arrays.sort(numbers);
        int lower = 0;
        int upper = numbers.length - 1;
        int iteration = 0;
        int toFind = 7;
        boolean found = false;
        while (lower <= upper) {
            iteration++;
            int mid = (lower + upper) / 2;
            if (toFind == numbers[mid]) {
                System.out.println(toFind + " found after iterations: " + iteration);
                found = true;
                break;
            }
            if (toFind < numbers[mid]) {
                upper = mid - 1;
            }
            if (toFind > numbers[mid]) {
                lower = mid + 1;
            }
        }
        if (!found) {
            System.out.println("item not found");
        }
    }
}
