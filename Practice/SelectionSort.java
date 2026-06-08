
import java.util.Scanner;


public class SelectionSort {
    static void Swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    static void SelSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            Swap(arr, i, min);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={3,5,7,2,4,6,79,32,34,23,45,13};
        SelSort(arr);
        for(int index:arr){
            System.out.print(index+" ");
        }
    }    
}
