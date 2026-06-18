public class prime {
    
    public void rangePrime(int range){
        for(int i=0;i<=range;i++){
            for(int j=2;j<i;j++){
                if(i%j==0){
                    break;
                }
                if(j==i-1){
                    System.out.println(i);
                }
            }
        }
    }
    public static void main(String[] args) {
        prime ob=new prime();
        ob.rangePrime(100);
        
    }
}
