//sum of Array Elements

import java.util.*;

public class SumArray
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);

        // Array Declaration and Memory Allocation
        int a[] = new int[5];

        System.out.println("Enter 5 elements");

        // Input Elements
        for(int i=0; i<a.length; i++)
        {
            a[i] = sc.nextInt();
        }

        // Initialize sum with 0
        int sum = 0;

        // Traverse array and calculate sum
        for(int i=0; i<a.length; i++)
        {
            sum = sum + a[i];
        }

        System.out.println("Sum is : " + sum);
    }
}