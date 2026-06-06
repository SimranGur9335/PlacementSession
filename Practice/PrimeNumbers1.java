package Practice;
class PrimeNumbers1 
{
    public static boolean isPrime(int num)
    {
        if(num < 2)
        {
            return false;
        }

        for(int i = 2; i < num; i++)
        {
            if(num % i == 0)
            {
                return false;
            }
        }

        return true;
    }

    public static void main(String args[])
    {
        System.out.println("Prime Numbers from 1 to 100:");

        for(int i = 1; i <= 100; i++)
        {
            if(isPrime(i))
            {
                System.out.print(i + " ");
            }
        }
    }
}