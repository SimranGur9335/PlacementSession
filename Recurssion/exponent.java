public class exponent {
    static int power(int base, int expo) {
        if (expo == 0) {
            return 1;
        }
        return base * power(base, expo - 1);
    }

    public static void main(String[] args) {
        System.out.println(power(2, 10));
    }
}
