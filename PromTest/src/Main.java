import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] array= new Integer[10];
        array[0]=3;
        for (int i = 0; i < array.length-1; i++) {
            array[i+1]= array[i]+3;
        }
        System.out.println(Arrays.toString(array));
    }
}