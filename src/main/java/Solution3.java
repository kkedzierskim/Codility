import java.util.ArrayList;
import java.util.Collections;

public class Solution3 {



        public int solution(int[] A) {

            int check = 0;
            int result = 0;

            for (int i = 1; i < A.length; i++) {
                if (A[i] > A[i - 1] && check == -1) {
                    check = 1;
                    result++;
                }
                if (A[i] < A[i - 1] && check == -1) {
                    check = -1;
                    result++;
                }
            }

            result++;

            return result;
        }
}


