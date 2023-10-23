package moso_midterm_2021;

public class Quiz1 {
    public static void main(String[] args) {
        int t, o, g, d;
        for (t = 0; t <= 9; t++) {
            for (o = 0; o <= 9; o++) {
                for (g = 0; g <= 9; g++) {
                    for (d = 0; d <= 9; d++) {
                        int n1 = (t * 100 + o * 10 + o) * 4;
                        int n2 = (g * 1000 + o * 100 + o * 10 + d);
                        if (n1 == n2) {
                            System.out.println("T : " + t + " || O : " + o + " || G : " + g + " || D: " + d);
                        }
                    }
                }
            }
        }
    }
}
