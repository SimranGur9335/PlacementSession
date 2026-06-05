class CountDigits
{
    static int count(int num)
    {
        if(num == 0)
        {
            return 0;
        }

        return 1 + count(num / 10);
    }

    public static void main(String args[])
    {
        int num = 12345;

        int digits = count(num);

        System.out.println("Number of Digits = " + digits);
    }
}