public class array {
    public static void main(String[] args){
        int[] arr={4,2,3,1,5};
        int small=arr[0];
        for(int i=1;i< arr.length;i++) {
            if (arr[i] < arr[0])
                small=arr[i];
        }
        System.out.print("Smallest element: " +small);
    }
}
