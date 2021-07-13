package Array;

import java.util.ArrayList;
import java.util.List;
// https://leetcode.com/problems/find-all-duplicates-in-an-array/

/**
 * Method1:
 * Sort the array and keep comparing the adjacent elements for duplicates.
 * This will cost us O(NlogN) complexity.
 * <p>
 * Method2: Efficient
 * Since the elements lie in the range from 1 to n. We can use the array itself for marking the visited elements.
 * We will iterate over the array and mark the element at the index nums[abs[nums[i]]-1] to its negative.
 * Before marking we will check:
 * If nums[abs(nums[i]-1)] > 0, means the element abs(nums[i]-1) has not been visited earlier and is unique so mark it.
 * Else if nums[abs(nums[i]-1)] > 0 is negative, then the element has been visited earlier and therefore duplicate.
 */


public class FindAllDuplicatesInAnArray {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        List<Integer> duplicates = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (nums[Math.abs(nums[i]) - 1] > 0) {
                nums[Math.abs(nums[i]) - 1] *= -1;
            } else {
                duplicates.add(Math.abs(nums[i]));
            }
        }
        return duplicates;
    }
}
