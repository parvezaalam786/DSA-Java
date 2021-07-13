package Array;

import java.util.Arrays;

/**
 * Method1:
 * Take a two separate arrays for even and odd elements and while iterating over the array add the elements in the
 * corresponding array
 * Space: O(n) Time: O(n)
 * <p>
 * Method2:
 * We will take two pointers, one from beginning and one from end and swap the elements at the position based on the
 * condition.
 */

public class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        int i = 0, j = nums.length - 1;
        while (i < j) {
            if (nums[i] % 2 == 0) {
                i++;
            } else if (nums[j] % 2 == 1) {
                j--;
            } else {
                swap(nums, i, j);
                i++;
                j--;
            }
        }
        return nums;
//        In one liner
//        return Arrays.stream(nums).boxed().sorted((a, b) -> Integer.compare(a % 2, b % 2)).mapToInt(i -> i).toArray();
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}