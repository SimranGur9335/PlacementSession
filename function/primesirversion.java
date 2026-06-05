public class primesirversion {
    public boolean isPrime(int num){
        for(int i=2;i<num;i++){
            if(num %i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        primesirversion obj=new primesirversion();
        for(int i=1;i<=100;i++){
            if(obj.isPrime(i)){
                System.out.println(i+" is Prime No");
            }
        }
    }
}
