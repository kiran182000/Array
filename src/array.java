public class array {
    public static void main(String[] args){
        int[] arr={0,1,2,3,4,5};
        for(int i=0;i< arr.length;i+=2){
            System.out.println("Elements at even position are: " +arr[i]);
        }
    }
}
