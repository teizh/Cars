import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(numbers));
        int length = numbers.length;
        int summ = 0;
        int count = 1;


        for (int num : numbers) {
            if (num < 0) {
                continue;
            }

            if (num > 0) {
                summ = num + summ;
                count = count + 1;
            }
        }
        System.out.println("Mean of array is: " + summ + "/" + count);





    }


}
