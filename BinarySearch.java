import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] nums, int target){
        int n = nums.length;
        int low = 0, high = n-1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(nums[mid] == target){
                return mid;
            }else if(target > nums[mid])
                    low = mid + 1;
                  else 
                    high = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int result = binarySearch(nums, target);
        System.out.println(result);
        sc.close();
    }
}
