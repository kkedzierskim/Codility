public class CountDiv {

    static int solution(int A, int B, int K) {

        int count = 0;

        for (int i = A; i <= B; i++) {
            if ((i % K) == 0) count++;
        }

        return count;
    }


    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int k = 2;

        System.out.println(solution(a,b,k));

    }


}
