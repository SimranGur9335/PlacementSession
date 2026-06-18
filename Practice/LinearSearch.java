

import java.util.Scanner;

public class LinearSearch {
    static int Linear(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr={1,5,6,7,3,2,5,3,4};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number to Search");
        int target=sc.nextInt();
        int index=Linear(arr,target);
        if(index!=-1){
            System.out.println("Element is at Index at:"+index);
        }else{
            System.out.println("Element Not Found!!");
        }
    }
}
