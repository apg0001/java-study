package moso_midterm_unknown;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Quiz_1 {

    public static void main(String[] args) throws IOException {
        String[] grade = {"A", "B", "C", "D", "F"};
        int[] score = {100, 80, 60, 40, 0};
        double total = 0;
        int count = 0;
        double result = 0;

        FileInputStream in = null;
        try {
            in = new FileInputStream("src/moso_midterm_unknown/gildong.txt");

            int i;
            String sIn = "";
            while ((i = in.read()) != -1) {
                sIn += (char) i;
            }

            String[] str = sIn.split(" ");

            for(int j=0;j<str.length;j++){
                System.out.println(j + " " + str[j]);
            }

            for (int j = 0; j < str.length; j++) {
                if (j % 2 == 1) {
                    int index = 0;
                    count++;
                    System.out.println(j + " " + index + " " + str[j]);
                    for (; index < grade.length; index++) {
                        if (str[j].equals(grade[index])) {
                            total += score[index];
                            break;
                        }
                    }
                }
            }

            result = total / count;

            System.out.println(total + " " + count);
            System.out.println("평점은 " + result + "점.");
        } finally {
            if (in != null)
                in.close();
        }

    }
}
