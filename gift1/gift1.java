import java.io.*;
import java.util.StringTokenizer;
/*
ID: rajoshi1
LANG: JAVA
TASK: gift1
*/
public class gift1 {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("gift1.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("gift1.out")));
        for (int abcd = 0; abcd < 9; abcd++) {
            int a = Integer.parseInt(f.readLine());
            int price[] = new int[a];
            String names[] = new String[a];
            int i = 0;
            while (i < a) {
                names[i] = f.readLine();
                i++;
            }
            for (int kk = 0; kk < a; kk++) {
                String j = f.readLine();
                i = 0;
                while (!(j.equals(names[i]))) {
                    i++;
                }
                StringTokenizer k = new StringTokenizer(f.readLine());
                int aaa = Integer.parseInt(k.nextToken());
                int b = Integer.parseInt(k.nextToken());
                if ((aaa == 0) || (b == 0)) {
                    int abc = 0;
                    while (abc < b) {
                        f.readLine();
                        abc++;
                    }
                    continue;
                }
                price[i] += ((aaa % b) - aaa);
                for (i = 0; i < b; i++) {
                    String jj = f.readLine();
                    int iii = 0;
                    while (!(jj.equals(names[iii]))) {
                        if (j.equals(names[iii])) {
                            iii++;
                            continue;
                        }
                        iii++;
                    }
                    price[iii] += (aaa/b);
                }
            }
            for (i = 0; i < a; i++) {
                out.println(names[i] + " " + price[i]);
            }
        }
        out.close();
    }
}
