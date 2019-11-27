import java.util.*;

public class MaxCounters {


    public static void main(String[] args) {
        int A[] = {3,4,4,6,1,4,4};

        System.out.println(Arrays.toString(solution(5,A)));
    }

    public static int[] solution(int N, int[] A) {
        int [] counters = new int[N];

        int maxCounter = 0; //for the next re-set will know what high score to set all values
        int lastResetCounter = 0; //for setting values that were never explicitly set - at the end

        for(int i=0; i<A.length; i++) {
            if(A[i] <= N) {
                if(counters[A[i]-1] < lastResetCounter) {
                    counters[A[i]-1] = lastResetCounter; }
                counters[A[i]-1]++;
                if(counters[A[i]-1] > maxCounter) {
                    maxCounter = counters[A[i]-1];
                }

            }
            else {
                //keep track of last reset counter
                lastResetCounter = maxCounter;
            }
        }
        //set all values to last reset value that was never explicitly changed after last reset
        for(int i=0; i<counters.length; i++) {
            if(counters[i] < lastResetCounter) {
                counters[i]  = lastResetCounter;
            }
        }

        return counters;
    }
}