public class Reverseno {

    static int rev = 0;

    static void reverseNumber(int num) {
        if (num == 0)
            return;

        rev = rev * 10 + num % 10;
        reverseNumber(num / 10);
    }

    public static void main(String[] args) {
        int num = 1203;

        reverseNumber(num);

        System.out.println(rev);
    }
}