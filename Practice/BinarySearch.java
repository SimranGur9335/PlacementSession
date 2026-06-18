
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    static int Bsearch(int arr[],int target){
        Arrays.sort(arr);
        int start=0;
        int end=arr.length-1;
        for(int i=0;i<arr.length;i++){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={2,3,4,5,1,7,8,9};
        int target=sc.nextInt();
        int index=Bsearch(arr, target);
        if(index!=-1){
            System.out.println(index);
        }else{
            System.out.println("Not Found!!!");
        }
        
    }
}
