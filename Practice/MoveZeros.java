package Practice;
class MoveZeros
{
    public static void main(String args[])
    {
        int arr[] = {1, 0, 2, 0, 3, 0, 4};
        int left = 0;

        for(int right = 0; right < arr.length; right++)
        {
            if(arr[right] != 0)
            {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
            }
        }

        System.out.println("Array After Moving Zeros:");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}