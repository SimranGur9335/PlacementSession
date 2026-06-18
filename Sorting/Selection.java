public class Selection {
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[min]) {
                    min = j;
                }
            }
            swap(arr, i, min);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 2, 1, 3, 2, 3, 4, 5, 8, 1 };

        selectionSort(arr);

        for (int index : arr) {
            System.out.print(index + " ");
        }
    }
}
