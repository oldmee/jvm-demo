package chapter3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author R.oldmee
 * @date 2019/1/13 6:39 PM
 */
public class TTT {

        public int add(int a, int b) {
            return a + b;
        }

        public static void main(String[] args) throws IOException {
            TTT test = new TTT();
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            for (int i = 0; i < 1; i++) {
                reader.readLine();
                int a = (int) Math.round(Math.random() * 1000);
                int b = (int) Math.round(Math.random() * 1000);
                System.out.println(test.add(a, b));
            }
        }
}
