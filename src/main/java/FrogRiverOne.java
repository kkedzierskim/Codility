import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FrogRiverOne {

    public static void main(String[] args) {
        int A[] = {1,3,1,4,2,3,5,4};

        System.out.println(solution(5,A));
    }


    static int solution(int x, int[] A) {

        Set<Integer> set1 = new HashSet<>();
        int counter = 0;
        for (int i = 0; i < A.length; i++) {
            set1.add(A[i]);
            counter++;
            if(set1.size() == x){
                return counter - 1;
            }
        }
        return -1;
    }
}
