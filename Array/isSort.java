public class isSort {
    public static void main(String[] args) {
        int arr[]={5,2,8,1,3};
        boolean isSorted=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted=false;
                break;
            }
        }
        if(isSorted){
            System.out.println("Array is Sorted");
        }else{
            System.out.println("Array is not Sorted");
        }
    }
}
