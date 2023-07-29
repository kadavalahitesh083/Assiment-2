import java.util.HashSet;

public class Assignement2_5 
{

    public static boolean hasSubarrayWithSumZero(int[] nums) 
    {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;

        for (int num : nums) 
        {
            sum += num;

          
            if (sum == 0 || set.contains(sum)) 
            {
                return true;
            }

            set.add(sum);
        }

        return false;
    }

    public static void main(String[] args) 
    {
        int[] arr1 = { 4, 2, -3, 1, 6 };
        int[] arr2 = { 4, 2, 0, 1, 6 };
        int[] arr3 = { -3, 2, 3, 1, 6 };

        System.out.println("Array 1 has subarray with sum zero? " + hasSubarrayWithSumZero(arr1));
        System.out.println("Array 2 has subarray with sum zero? " + hasSubarrayWithSumZero(arr2));
        System.out.println("Array 3 has subarray with sum zero? " + hasSubarrayWithSumZero(arr3));
    }
}
