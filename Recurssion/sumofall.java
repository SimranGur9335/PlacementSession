public class sumofall {
    public int sum(int n){
        if(n==0){
            return 0;
        }
        return n +sum(n-1);
    }
    public static void main(String[] args) {
        sumofall obj=new sumofall();
        int sum=obj.sum(10);
        System.out.println("Sum of 10 :"+sum);
    }
}