import java.io.*;
import java.util.*;
/*
ID: rajoshi1
LANG: JAVA
PROG: beads
*/
public class beads {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("beads.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("beads.out")));
        for (int i = 0; i < 9; i++) {
            int n = Integer.parseInt(f.readLine());
            char ch[] = f.readLine().toCharArray();
            int count = 0;
            myBreakLabel:
            for (int a = 0; a < n; a++) {
                int i = a;
                int j = 0;
                List<Integer> list = new ArrayList<>();
                while (ch[i] == 'w') {
                    list.add(i);
                    if (i == (n - 1)) {
                        i = 0;
                    } else {
                        i++;
                    }
                    j++;
                    if (j == n) {
                        count = n;
                        break myBreakLabel;
                    }
                }
                char abc = ch[i];
                while ((ch[i] == abc) || (ch[i] == 'w')) {
                    list.add(i);
                    if (i == (n - 1)) {
                        i = 0;
                    } else {
                        i++;
                    }
                    j++;
                    if (j == n) {
                        count = n;
                        break myBreakLabel;
                    }
                }
                if (a == 0) {
                    i = n - 1;
                } else {
                    i = a - 1;
                }
                while (ch[i] == 'w') {
                    list.add(i);
                    if (i == 0) {
                        i = n - 1;
                    } else {
                        i--;
                    }
                    j++;
                }
                abc = ch[i];
                while ((ch[i] == abc) || (ch[i] == 'w')) {
                    if (!list.contains(i)) {
                        list.add(i);
                        if (i == 0) {
                            i = n - 1;
                        } else {
                            i--;
                        }
                        j++;
                    } else {
                        count = n;
                        break myBreakLabel;
                    }
                }
                if (count < j) {
                    count = j;
                }
            }
            out.println(count);
        }
        out.close();
    }
}
