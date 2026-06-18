public class Duplicate {
    public static void main(String[] args) {
        int arr[] = {5, 2, 8, 1, 3, 2, 3, 4, 5, 8, 1};
        int arr2[] = new int[arr.length];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < count; j++) {
                if (arr[i] == arr2[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                arr2[count] = arr[i];
                count++;
            }
        }

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < count; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}