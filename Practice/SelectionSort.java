<<<<<<< HEAD
package Practice;
class SelectionSort{
    public static void main(String args[]){
        int arr[] = {3, 5, 2, 1, 7};
        for(int i = 0; i < arr.length - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[minIndex])
                {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.println("Sorted Array in Ascending Order:");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
=======

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
>>>>>>> janmesh/main
