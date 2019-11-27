import java.util.*;

public class FrogJump {

    public static void main(String[] args) {
        int A[] = {2, 3, 1, 5};

        System.out.println(solution(A));
    }


    static int solution(int[] A){

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < A.length ; i++) {
            set.add(A[i]);
        }
        Iterator iterator = set.iterator();
        while(iterator.hasNext())
        {
            int B = (int)iterator.next();
            int C = (int)iterator.next();
           if((B + 1) != C ){
               return B + 1;
           }
           else
           {
               continue;
           }
        }
        throw new RuntimeException("shouldn got there");
    }
}
