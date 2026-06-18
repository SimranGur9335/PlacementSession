public class armstrong {
    public void armstrongrang(int range){
        for(int i=0;i<=range;i++){
            int temp=i;
            int count = (i == 0) ? 1 : 0;
            while (temp!=0){
                count++;
                temp/=10;
            }
            temp=i;
            int sum=0;
            while(temp!=0){
                int digit=temp%10;
                sum+=(int) Math.pow(digit, count);
                temp/=10;
            }
            if (sum ==i){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        armstrong obj=new armstrong();
        obj.armstrongrang(200);
    }
}
