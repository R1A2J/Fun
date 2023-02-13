import java.io.*;
/*
ID: rajoshi1
LANG: JAVA
PROG: friday
*/
public class friday {
    public static void main (String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("friday.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("friday.out")));
        int n = Integer.parseInt(f.readLine()) * 12;
        int freq[] = new int[7];
        int a = 2;
        int year = 1900;
        for (int i = 1; i <= n; i++) {
            a %= 7;
            if (a == 0) {
                freq[5] += 1;
            } else if (a == 1) {
                freq[6] += 1;
            } else {
                freq[a - 2] += 1;
            }
            if ((i % 12 == 0) || (i % 12 == 1) || (i % 12 == 3) || (i % 12 == 5) || (i % 12 == 7) || (i % 12 == 8) || (i % 12 == 10)) {
                a += 3;
            } else if ((i % 12 == 4) || (i % 12 == 6) || (i % 12 == 9) || (i % 12 == 11)) {
                a += 2;
            } else {
                if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                    a++;
                }
            }
            if (i % 12 == 0) {
                year++;
            }
        }
        int i = 0;
        while (i < 6) {
            out.print(freq[i] + " ");
            i++;
        }
        out.println(freq[6]);
        out.close();
    }
}
