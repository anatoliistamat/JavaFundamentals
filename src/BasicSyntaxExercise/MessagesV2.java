package BasicSyntaxExercise;

import java.util.Scanner;

public class MessagesV2 {

    public static void main(String[] args) {
        String a = "a", b = "b", c = "c"; // 2
        String d = "d", e = "e", f = "f"; // 3
        String g = "g", h = "h", i = "i"; // 4
        String j = "j", k = "k", l = "l"; // 5
        String m = "m", n = "n", o = "o"; // 6
        String p = "p", q = "q", r = "r", s = "s"; // 7
        String t = "t", u = "u", v = "v"; // 8
        String w = "w", x = "x", y = "y", z = "z"; // 9
        String space = " "; // 0
        StringBuilder message = new StringBuilder();
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        int index = 0;

        while (index != input) {
            int number = Integer.parseInt(scanner.nextLine().trim());
            if (number == 2) {
                message.append(a);
            }
            if (number == 22) {
                message.append(b);
            }
            if (number == 222) {
                message.append(c);
            }

            if (number == 3) {
                message.append(d);
            }
            if (number == 33) {
                message.append(e);
            }
            if (number == 333) {
                message.append(f);
            }

            if (number == 4) {
                message.append(g);
            }
            if (number == 44) {
                message.append(h);
            }
            if (number == 444) {
                message.append(i);
            }

            if (number == 5) {
                message.append(j);
            }
            if (number == 55) {
                message.append(k);
            }
            if (number == 555) {
                message.append(l);
            }

            if (number == 6) {
                message.append(m);
            }
            if (number == 66) {
                message.append(n);
            }
            if (number == 666) {
                message.append(o);
            }

            if (number == 7) {
                message.append(p);
            }

            if (number == 77) {
                message.append(q);
            }

            if (number == 777) {
                message.append(r);
            }
            if (number == 7777) {
                message.append(s);
            }

            if (number == 8) {
                message.append(t);
            }
            if (number == 88) {
                message.append(u);
            }
            if (number == 888) {
                message.append(v);
            }

            if (number == 9) {
                message.append(w);
            }

            if (number == 99) {
                message.append(x);
            }

            if (number == 999) {
                message.append(y);
            }

            if (number == 9999) {
                message.append(z);
            }

            if (number == 0) {
                message.append(space);
            }

            ++index;
        }

        System.out.println(message.toString().trim());
    }
}

