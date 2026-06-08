public class SortZero {
    static void sortZero(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {

                for (int j = i; j < n - 1; j++) {
                    arr[j] = arr[j + 1];
                }

                arr[n - 1] = 0;
                n--;
                i--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 0,0, 5, 0, 6 };

        sortZero(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}