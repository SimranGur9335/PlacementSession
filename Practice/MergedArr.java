public class MergedArr {
    static void MergedArray(int arr1[],int arr2[]){
        int n=arr1.length;
        int m=arr2.length;
        int merge[]=new int[m+n];

        int i=0; 
        int j=0;
        int k=0;

        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                merge[k]=arr1[i];
                i++;
            }else{
                merge[k]=arr2[j];
                j++;
            }
            k++;
        }
        while(i<n){
            merge[k++]=arr1[i++];
        }
        while(j<m){
            merge[k++]=arr2[j++];
        }
        for(int num:merge){
            System.out.print(num+ " ");
        }
    }
    public static void main(String[] args) {
        int arr1[] = { 1, 3, 5, 7 };
        int arr2[] = { 2, 4, 6, 8 };
        MergedArray(arr1, arr2);

    }
}
