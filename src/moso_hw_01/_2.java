package moso_hw_01;
import java.io.*;

public class _2 {
    public static void main(String[] args) {
        FileInputStream first = null;
        FileInputStream second = null;
        FileOutputStream third = null;

        try{
            first = new FileInputStream("src/moso_hw_01/first.txt");
            second = new FileInputStream("src/moso_hw_01/second.txt");
            third = new FileOutputStream("src/moso_hw_01/third.txt");

            int i, j;
            String s1="", s2="";
            while( (i = first.read()) != -1){
                s1 += (char)i;
            }
            while((j=second.read()) != -1){
                s2 += (char)j;
            }

            String[] sFirst = s1.split(" ");
            String[] sSecond = s2.split(" ");

            for(String sF : sFirst){
                for(String sS : sSecond){
                    if(sF.equals(sS)) {
                        byte[] bytes = sF.getBytes();
                        for(byte b : bytes){
                            third.write(b);
                        }
                        third.write((" ".getBytes()));
                    }
                }
            }
        }
        catch (IOException e){
            System.out.println(e);
        }
        finally{
            try{
                first.close();
                second.close();
                third.close();
            }
            catch(IOException io){}
        }
    }
}
