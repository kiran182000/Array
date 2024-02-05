import java.util.Arrays;
public class array {
    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 9, 4, 6};
        Arrays.sort(arr);
        System.out.print("Second largest element is: " + arr[arr.length-2]);
    }
}
