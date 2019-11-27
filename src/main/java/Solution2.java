import java.util.*;

public class Solution2 {


    public static void main(String[] args) {

        System.out.println(solution2(123123));

    }


    static int solution2(int N) {
        if(N > 100000000){
            return -1;
        }

        ArrayList<Integer> array = new ArrayList<Integer>();
        do{
            array.add(N % 10);
            N /= 10;
        } while  (N > 0);

        Collections.sort(array);

        StringBuilder sb = new StringBuilder();
        for (int i = array.size() - 1; i >= 0 ; i--) {
            sb.append(array.get(i));
        }

        return Integer.valueOf(sb.toString());

    }

}
