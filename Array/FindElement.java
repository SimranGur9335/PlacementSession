public class FindElement {

    static int findElement(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 2, 1, 3, 2, 3, 4, 5, 8, 1};
        int key = 2;

        int index = findElement(arr, key);

        if (index != -1) {
            System.out.println("Found at index: " + index);
        } else {
            System.out.println("Not Available");
        }
    }
}