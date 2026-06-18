import java.util.Scanner;

public class SumofDigit {
    static int sum(int num){
        if(num ==0 ){
            return 0;
        }
        return (num%10) +sum(num/10); 
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int ob=sum(s);
        System.out.println(ob);
    }    
}
