import java.util.Scanner;

public class findMin {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min=Integer.MAX_VALUE;
        int arr[] = new int[8];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }

        System.out.println("Max Element From arr Is:"+min);
    }
}
