class Exponent
{
    static int power(int base, int exp)
    {
        if(exp == 0)
        {
            return 1;
        }

        return base * power(base, exp - 1);
    }

    public static void main(String args[])
    {
        int result = power(5, 5);

        System.out.println("5^5 = " + result);
    }
}