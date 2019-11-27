import org.junit.Test;
import test.threads.Program;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ElephantAlgorithmTest {

    @Test
    public void slo1_test() throws IOException {

        assertEquals(sloTest("slo1.in"), 11200);
    }


    public int sloTest(String path) throws IOException {


        Reader reader = new FileReader("C:\\Users\\User\\Desktop\\testy\\TESTING\\src\\main\\resources\\dane\\" + path);

        BufferedReader bf = new BufferedReader(reader);

        String row1 = bf.readLine(); //liczba słoni
        String row2 = bf.readLine();
        String row3 = bf.readLine();
        String row4 = bf.readLine();

        int n = Integer.valueOf(row1);
        String[] w2 = row2.split(" ");
        String[] w3 = row3.split(" ");
        String[] w4 = row4.split(" ");

        int[] m = Arrays.stream(w2).mapToInt(Integer::parseInt).toArray(); //masy słoni
        int[] a = Arrays.stream(w3).mapToInt(Integer::parseInt).toArray(); //aktualne ustawienie
        int[] b = Arrays.stream(w4).mapToInt(Integer::parseInt).toArray(); //proponnowane ustawienie

        Program p = new Program();


        return p.elephantAlgorithm(n, m, a, b);
    }
}
