import java.util.Scanner;

public class Inputout {
    public static void main(String[] args) {
        int arr[] =new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Your arrays Element are: ");
        for(int i=0;i<arr.length;i++){
            System.out.println("Array Element at Index "+i+":"+arr[i]);
        }
    }
}
