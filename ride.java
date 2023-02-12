package usacocomp;
import java.io.*;
/*
ID: rajoshi1
LANG: JAVA
PROG: ride
*/
public class ride {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("ride.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));
        char[] first = f.readLine().toCharArray();
        int sum1 = 1;
        for (int i = 0; i < first.length; i++) {
            int j = first[i];
            sum1 *= (j - 64);
        }
        char[] second = f.readLine().toCharArray();
        int sum2 = 1;
        for (int i = 0; i < second.length; i++) {
            int j = second[i];
            sum2 *= (j - 64);
        }
        if ((sum1 % 47) == (sum2 % 47)) {
            out.println("GO");
        } else {
            out.println("STAY");
        }
        out.close();
    }
}