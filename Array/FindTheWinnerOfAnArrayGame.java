package Array;
// https://leetcode.com/problems/find-the-winner-of-an-array-game/

/**
 * Here we will iterate over the array. We will maintain two variables:
 * 1. winner
 * 2. win_count
 * If the winner keeps winning the game, we will increase win_count
 * If the winner loses the game, then we will update the new winner and make win_count = 1
 * If win_count == k or we are at the end of the loop, we will return the winner
 * There might be confusion around the circular part, but if we look closely we will find that if we are heading towards
 * the end of the array and arr[x] keeps winning till end, then all the elements before arr[x] i.e. 1 to x - 1 will lose
 * with it. So arr[x] will always be the answer in such case (also when k > n).
 */

public class FindTheWinnerOfAnArrayGame {
    public int getWinner(int[] arr, int k) {
        int winner = arr[0];
        int win_count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (winner > arr[i]) {
                win_count++;
            } else {
                winner = arr[i];
                win_count = 1;
            }
            if (win_count == k) {
                return winner;
            }
        }
        return winner;
    }
}
