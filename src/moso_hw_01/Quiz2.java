package moso_hw_01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Quiz2 {
    public static void main(String[] args) throws IOException {
        FileInputStream first = null;
        FileInputStream second = null;
        FileOutputStream third = new FileOutputStream("src/moso_hw_01/third.txt");
        try {
            first = new FileInputStream("src/moso_hw_01/first.txt");
            second = new FileInputStream("src/moso_hw_01/second.txt");

            String strFirst = "";
            String strSecond = "";
            String[] arrFirst;
            String[] arrSecond;

            int i = 0;
            while((i=first.read())!=-1){
                strFirst += (char)i;
            }

            i=0;
            while((i=second.read())!=-1){
                strSecond += (char)i;
            }

            arrFirst = strFirst.split(" ");
            arrSecond = strSecond.split(" ");

            for(String n1 : arrFirst){
                for(String n2 : arrSecond){
                    if(n1.equals(n2)){
                        third.write(n1.getBytes());
                        third.write(" ".getBytes());
                    }
                }
            }
        }
        finally{
            first.close();
            second.close();
        }
    }
}
