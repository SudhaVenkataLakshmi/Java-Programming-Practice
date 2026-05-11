import java.util.Scanner;

public class ElementPosition {
     public static int firstPosition(int[] nums, int target) 
	{
        int low = 0, high = nums.length - 1;
        int ans = -1;

        while (low <= high) 
		{
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) 
			{
                ans = mid;
                high = mid - 1; 				// move left
            }
            else if (nums[mid] < target) 
			{
                low = mid + 1;
            }
            else 
			{
                high = mid - 1;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int result = firstPosition(nums, target);

        System.out.println(result);

        sc.close();
    }
}
