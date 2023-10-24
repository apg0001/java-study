package moso_hw_01;
import java.util.Scanner;

class Score {
    int[][] data = {
            {-1, 100, 101, 102, 103, 104},
            {0, 3, 1, 5, 2, 5},
            {1, 4, 2, 1, 4, 2},
            {2, 5, 3, 1, 2, 4},
            {3, 2, 1, 5, 4, 4},
            {4, 3, 3, 4, 3, 3}
    };

    void printAverageMovie() {
        for (int i = 1; i <= 5; i++) {
            double total = 0;
            double average;
            for (int j = 1; j <= 5; j++) {
                total += data[j][i];
            }
            average = total / 5;
            System.out.println(data[0][i] + " 영화 평점 평균 : " + average);
        }
    }

    void printAverageUser() {
        for (int i = 1; i <= 5; i++) {
            double total = 0;
            double average;
            for (int j = 1; j <= 5; j++) {
                total += data[i][j];
            }
            average = total / 5;
            System.out.println(data[i][0] + " 사용자 평점 평균 : " + average);
        }
    }

    double getCartesianDistance(int movieNumber, int movieIndex){
        double sum = 0;
        double result;
        int index = 0;

        for(int i=1;i<=5;i++){
            if(data[0][i]==movieNumber){
                index = i;
                break;
            }
        }

        for(int i=1;i<=5;i++){
            sum+=Math.pow(data[i][index] - data[i][movieIndex], 2);
        }

        result = Math.sqrt(sum);
        return result;
    }

    void printSimillarMovie(int movieNumber){
        int index = 0;
        int result = -1;
        double minDistance = 1e9;
        for(int i=1;i<=5;i++){
            if(data[0][i]==movieNumber)
                continue;
            double distance = getCartesianDistance(movieNumber, i);
            System.out.println(data[0][i] + " : " + distance);
            if(distance < minDistance){
                index = i;
                minDistance = distance;
            }
        }
        result = data[0][index];
        System.out.println(movieNumber + "과 점수가 가장 비슷한 영화는 " + result);
    }
}

public class Quiz1 {
    public static void main(String[] args) {
        Score score = new Score();
        score.printAverageMovie();
        score.printAverageUser();

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        score.printSimillarMovie(input);
    }
}
