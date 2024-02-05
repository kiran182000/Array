import java.util.HashMap;

public class array {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 3, 1, 2, 4, 5, 3, 2};

        HashMap<Integer, Integer> frequency = new HashMap<>();
        for (int i : array) {
            if (frequency.containsKey(i)) {
                frequency.put(i, frequency.get(i) + 1);
            } else {
                frequency.put(i, 1);
            }
        }
        for (int key : frequency.keySet()) {
            System.out.println("Element " + key + " occurs " + frequency.get(key) + " times");
        }
    }
}

