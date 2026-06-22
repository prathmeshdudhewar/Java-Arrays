import java.util.*;

public class LinearSearch
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[5];

        System.out.println("Enter 5 elements");

        // Input Array Elements
        for(int i=0; i<a.length; i++)
        {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter element to search");

        int key = sc.nextInt();

        boolean found = false;

        // Search Element
        for(int i=0; i<a.length; i++)
        {
            if(a[i] == key)
            {
                System.out.println("Element Found at Index : " + i);
                found = true;
                break;
            }
        }

        if(found == false)
        {
            System.out.println("Element Not Found");
        }
    }
}