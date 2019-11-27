import java.util.Arrays;

public class PermMissingElement {

    public int solution(int[] A) {
        if (A.length > 0) {
            Arrays.sort(A);
            for (int i = 0; i < A.length - 1; i++) {
                if (A[i] != (A[i + 1] - 1)) {
                    return A[i] + 1;
                }
            }
        }
        throw new RuntimeException("should't get there");
    }
}
