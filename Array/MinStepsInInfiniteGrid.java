package Array;
// https://www.interviewbit.com/problems/min-steps-in-infinite-grid/

import java.util.ArrayList;

public class MinStepsInInfiniteGrid {
    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        int minSteps = 0;
        int n = A.size();

        for (int i = 0; i < n - 1; i++) {
            int x = Math.abs(A.get(i) - A.get(i + 1));
            int y = Math.abs(B.get(i) - B.get(i + 1));

            minSteps += Math.max(x, y);
        }
        return minSteps;
    }
}
