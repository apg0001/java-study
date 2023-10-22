package moso_hw_01;
import java.util.Scanner;
import java.lang.Math;

public class _1 {
    static int[][] table ={
            {-1, 100, 101, 102, 103, 104},
            {0, 3, 1, 5, 2, 5},
            {1, 4, 2, 1, 4, 2},
            {2, 5, 3, 1, 2, 4},
            {3, 2, 1, 5, 4, 4},
            {4, 3, 3, 4, 3, 3}
    };
    public static void getCartesianDistance(int movieNum){
        double result = Integer.MAX_VALUE;
        int index=-1;
        double[] dist = {0,0,0,0,0};

        for(int i=1;i<6;i++){
            for(int j=1;j<6;j++){
                dist[i-1]+=Math.pow(table[j][movieNum]-table[j][i], 2);
            }
            dist[i-1]=Math.sqrt(dist[i-1]);
        }

        for(int i=0;i<5;i++){
            if(dist[i]<result||dist[i]!=0) {
                result = dist[i];
                index=i;
            }
        }
        System.out.println("영화 번호 : " + table[0][index+1]+"차이 값 : " + result);
    }

    public static void main(String[] args) {

        double[] movieScore = new double[5];

        for(int i = 1; i < 6; i++){
            double sum = 0;
            for(int j =0;j<6;j++){
                if(j==0)
                    System.out.print("영화 : " + table[j][i]);
                else
                    sum+=table[j][i];
            }
            sum/=5;
            System.out.println(" / 점수 : " + sum + "점");

            movieScore[i-1]=sum;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("영화 번호를 입력하세요");
        int movieNum = sc.nextInt();

        int index=-1;
        for(int i=1;i<6;i++){
            if(table[0][i]==movieNum){
                index=i;
                break;
            }
        }

        getCartesianDistance(index);
    }
}
