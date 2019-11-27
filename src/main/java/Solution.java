public class Solution {

    public int[] solution(int N) {

         int[] A = new int[N];
    int iCounter = 0;

        if (N == 1) {
        A[0] = 0;
    }
        if (N == 2) {
        A[0] = 1;
        A[1] = -1;
    }
        if (N > 2) {
        for (int i = 0; i < A.length - 1; i++) {
            A[i] = i;
            iCounter += i;
        }
        A[A.length - 1] = -iCounter;
    }

        return A;

}




    public static void main(String[] args) {
        Solution solution = new Solution();

       int[]A = solution.solution(233);

       int sum = 0;
        for (int i = 0; i <A.length ; i++) {
            sum += A[i];

        }
        System.out.println(sum);

    }
}
