import java.util.Arrays;

public class NonEmptyArray {

    static int solution(int[] A) {

        Arrays.sort(A);
        for (int i = 0; i <A.length - 1 ; i++) {
            if(A[i] != A[i+1]){
                return A[i];
            }}
        return 0;
    }



    public static void main(String[] args) {

    }
}
