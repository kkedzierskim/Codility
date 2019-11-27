import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class DemoTask {
    public int solution(int[] A) {
        Set testedSet = new TreeSet();
        Set perfectSet = new TreeSet();

        for(int i=0; i<A.length; i++) {
            testedSet.add(A[i]);   //convert array to set to get rid of duplicates, order int's
            perfectSet.add(i+1);  //create perfect set so can find missing int
        }

        for (int i = 1; i < perfectSet.size() ; i++) {
            if(!testedSet.contains(i)) {
                return i;
            }
        }

        if(perfectSet.size() == testedSet.size()) {
            return perfectSet.size() + 1;  //e.g. {1, 2, 3} should return 4
        }

        return 1; //default - e.g. if A array has negative values or just a single positive value like 10
    }
}
