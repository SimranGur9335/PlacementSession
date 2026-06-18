package Basic;
import java.util.Scanner;

public class TempConverstion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Type of Temp:");
        char typetemp=sc.nextLine().charAt(0);
        
        System.out.println("Enter Temperature:");
        double temp=sc.nextDouble();
        double result=0;
        if(typetemp =='C'){
            result=(temp * 1.8) + 32;
            System.out.println("Conversion of C to F: "+result);
        }else if(typetemp =='F'){
            result= (temp-32) /1.8;
            System.out.println("Conversion of F to C :"+result);
        }else{
            System.out.println("Invalid Input");
        }
    }
}
