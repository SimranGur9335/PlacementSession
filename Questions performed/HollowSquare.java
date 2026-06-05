// // // // // class HollowSquare
// // // // // {
// // // // //     public static void main(String args[])
// // // // //     {
// // // // //         int rows = 4;
// // // // //         for(int i = 1; i <= rows; i++)
// // // // //         {
// // // // //             for(int j = 1; j <= rows; j++)
// // // // //             {
// // // // //                 if(i == 1 || i == rows || j == 1 || j == rows)
// // // // //                 {
// // // // //                     System.out.print("*");
// // // // //                 }
// // // // //                 else
// // // // //                 {
// // // // //                     System.out.print(" ");
// // // // //                 }
// // // // //             }
// // // // //             System.out.println();
// // // // //         }
// // // // //     }
// // // // // }

// // // // class Pattern
// // // // {
// // // //     public static void main(String args[])
// // // //     {
// // // //         int rows = 5;

// // // //         for(int i = 1; i <= rows; i++)
// // // //         {
// // // //             for(int j = 1; j < i; j++)
// // // //             {
// // // //                 System.out.print(" ");
// // // //             }

// // // //             System.out.println("****");
// // // //         }
// // // //     }
// // // // }

// // // // class Pattern
// // // // {
// // // //     public static void main(String args[])
// // // //     {
// // // //         int rows = 4;

// // // //         for(int i = 1; i <= rows; i++)
// // // //         {
// // // //             for(int j = 1; j <= rows - i; j++)
// // // //             {
// // // //                 System.out.print(" ");
// // // //             }

// // // //             for(int k = 1; k <= i; k++)
// // // //             {
// // // //                 System.out.print("* ");
// // // //             }

// // // //             System.out.println();
// // // //         }
// // // //     }
// // // // }

// // // class Diamond
// // // {
// // //     public static void main(String args[])
// // //     {
// // //         int rows = 5;
// // //         // Upper Part
// // //         for(int i = 1; i <= rows; i++)
// // //         {
// // //             for(int j = 1; j <= rows - i; j++)
// // //             {
// // //                 System.out.print(" ");
// // //             }
// // //             for(int k = 1; k <= (2 * i - 1); k++)
// // //             {
// // //                 System.out.print("*");
// // //             }
// // //             System.out.println();
// // //         }
// // //         // Lower Part
// // //         for(int i = rows - 1; i >= 1; i--)
// // //         {
// // //             for(int j = 1; j <= rows - i; j++)
// // //             {
// // //                 System.out.print(" ");
// // //             }
// // //             for(int k = 1; k <= (2 * i - 1); k++)
// // //             {
// // //                 System.out.print("*");
// // //             }
// // //             System.out.println();
// // //         }
// // //     }
// // // }


// // class Butterfly
// // {
// //     public static void main(String args[])
// //     {
// //         int rows = 4;

// //         // Upper Part
// //         for(int i = 1; i <= rows; i++)
// //         {
// //             for(int j = 1; j <= i; j++)
// //             {
// //                 System.out.print("*");
// //             }

// //             for(int j = 1; j <= 2 * (rows - i); j++)
// //             {
// //                 System.out.print(" ");
// //             }

// //             for(int j = 1; j <= i; j++)
// //             {
// //                 System.out.print("*");
// //             }

// //             System.out.println();
// //         }

// //         // Lower Part
// //         for(int i = rows; i >= 1; i--)
// //         {
// //             for(int j = 1; j <= i; j++)
// //             {
// //                 System.out.print("*");
// //             }

// //             for(int j = 1; j <= 2 * (rows - i); j++)
// //             {
// //                 System.out.print(" ");
// //             }

// //             for(int j = 1; j <= i; j++)
// //             {
// //                 System.out.print("*");
// //             }

// //             System.out.println();
// //         }
// //     }
// // }

// import java.util.Scanner;
// class ReverseNumber
// {
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a Number: ");
//         int num = sc.nextInt();
//         int reverse = 0;
//         while(num != 0)
//         {
//             int digit = num % 10;
//             reverse = reverse * 10 + digit;
//             num = num / 10;
//         }
//         System.out.println("Reversed Number = " + reverse);
//     }
// }
import java.util.Scanner;

class Palindrome
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        int original = num;
        int reverse = 0;
        while(num != 0)
        {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        if(original == reverse)
        {
            System.out.println("Palindrome Number");
        }
        else
        {
            System.out.println("Not a Palindrome Number");
        }
    }
}
