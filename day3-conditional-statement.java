import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        int remainder = N % 2;
        // System.out.println("remainder"+remainder);
        if (remainder == 0) {
            if (2 <= N && N <= 5) {
                System.out.println("Not Weird");
            }

            if (6 <= N && N <= 20) {
                System.out.println("Weird");
            }

            if (20 < N) {
                System.out.println("Not Weird");
            }

        } else {
            System.out.println("Weird");
        }

        bufferedReader.close();
    }
}
