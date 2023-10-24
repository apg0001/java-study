package moso_midterm_unknown_2;
import java.util.Vector;
import java.io.FileInputStream;
import java.io.IOException;


abstract class Graph{
    Vector<Integer> score = new Vector<>();
    Vector<String> name = new Vector<>();

    Graph()throws IOException{
        FileInputStream in = null;

        try{
            String str = "";
            String[] strSep;
            int i = 0;
            in = new FileInputStream("src/moso_midterm_unknown_2/score.txt");

            while((i = in.read()) != -1)
                str += (char)i;

            strSep = str.split("\n");

            for(int j=0;j<strSep.length;j+=2){
                name.add(strSep[j]);
                score.add(Integer.parseInt(strSep[j+1]));
            }
        }
        finally{
            in.close();
        }
    }


}

public class Quiz_2 {
}
