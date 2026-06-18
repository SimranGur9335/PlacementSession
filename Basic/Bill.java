package Basic;
import java.util.Scanner; 
public class Bill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Unit Consume:");
        int bill=0;
        int unit=sc.nextInt();

        if(unit<=100){
            bill=unit*1;
        }else if(unit>100 && unit<=200){
            bill=100+(unit-100)*2;
        }else if(unit>200 && unit<=300){
            bill=100+200+(unit-200)*3;
        }else{
            bill = 100 + 200 + 300 + (unit - 300) * 4;
        }

        if (unit > 400) {
            bill = bill * 5;
        }

        System.out.println("Bill For Unit "+unit+":"+bill);
        sc.close();
    }
}
