
import java.util.Scanner;

public class Avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter Mark of Sub" + i);
            arr[i]=sc.nextInt();
        }
        int sum=0;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);

        int avg=sum/arr.length;

        System.out.println("Avg of mark:"+avg);

    }
}
