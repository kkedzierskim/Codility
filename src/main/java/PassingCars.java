public class PassingCars {

    public static void main(String[] args) {
        int A[] = { 0, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1 };

        System.out.println(solution(A));
    }


    public static int solution(int[] A) {
        int zeros = 0;
        int carPasses = 0;

        for(int i=0; i<A.length; i++) {
            if(A[i] == 0) { zeros++;
            }
            else if(A[i] == 1)
            {
            carPasses += zeros;
            if(carPasses > 1000000000) {
            return -1;
            }
        }
      else throw new RuntimeException("shouldn't reach here");
    }
    return carPasses;
}
}