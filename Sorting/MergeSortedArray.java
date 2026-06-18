public class MergeSortedArray {
    static void merge(int arr1[], int arr2[]) {
        int i = 0, j = 0, k = 0;

        int n = arr1.length;
        int m = arr2.length;

        int arr[] = new int[n + m];

        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                arr[k] = arr1[i];
                i++;
            } else {
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < n) {
            arr[k] = arr1[i];
            i++;
            k++;
        }

        while (j < m) {
            arr[k] = arr2[j];
            j++;
            k++;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int arr1[] = {1, 3, 5, 7};
        int arr2[] = {2, 4, 6, 8};

        merge(arr1, arr2);
    }
}