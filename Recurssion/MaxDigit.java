package Recurssion;

public class MaxDigit {
    static int findMaxDigit(int num){
        if(num ==0){
            return 0;
        }
        int digit=num%10;
        int maxofReamining=findMaxDigit(num/10);

        if(digit>maxofReamining){
            return digit;
        }
        else{
            return maxofReamining;
        }
    }
    public static void main(String[] args) {
        int num = 12345;
        int maxDigit = findMaxDigit(num);
        System.out.println("Maximum digit in" + num + "is: " + maxDigit);
    }
}
