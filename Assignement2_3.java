import java.util.Arrays;

public class Assignement2_3 
{

    public static int findSmallestUnrepresentable(int[] arr) 
    {
        Arrays.sort(arr);
        int smallestUnrepresentable = 1;

        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] <= smallestUnrepresentable) 
            {
                smallestUnrepresentable += arr[i];
            } 
            else 
            {
                break;
            }
        }

        return smallestUnrepresentable;
    }

    public static void main(String[] args) 
    {
        int[] arr = {1, 3, 6, 10, 11, 15};

        int smallestUnrepresentable = findSmallestUnrepresentable(arr);
        System.out.println("Smallest Unrepresentable Integer: " + smallestUnrepresentable);
    }
}
