package moso_midterm_unknown_2;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Vector;
import java.util.Scanner;

public class Quiz_1 {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        try{
            in = new FileInputStream("src/moso_midterm_unknown_2/score.txt");
            String scoreInput = "";
            int i = 0;
            while((i = in.read()) != -1){
                scoreInput += (char)i;
            }
            String[] scoreName = scoreInput.split("\n");
            Vector<String> name = new Vector<>();
            Vector<Double> score = new Vector<>();

            for(int j=0;j<scoreName.length;j+=2){
                name.add(scoreName[j]);
                score.add(Double.valueOf(scoreName[j+1]));
            }

            int index = 0;
            double total = 0;
            double average;
            for(int j=0;j<score.size();j++){
                total+=score.get(j);
                if(score.get(j)>score.get(index));
                index=j;
            }

            average = total / score.size();
            System.out.println("최대 점수 사람 : " + name.get(index));
            System.out.println("평균 점수 : " + average);

            index =0 ;
            Scanner sc = new Scanner(System.in);
            String inputName = sc.nextLine();

            for(int j=0;j<name.size();j++){
                if(name.get(j).equals(inputName)){
                    index = j;
                    break;
                }
            }

            System.out.println(inputName + "의 점수는 " + score.get(index));
        }
        finally{
            in.close();
        }
    }
}
