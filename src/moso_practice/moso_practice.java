package moso_practice;
import java.util.Scanner;

class Circle{
    double radius;

    Circle(double r){
        radius = r;
    }

    double getArea(){
        double area = Math.pow(radius, 2) * Math.PI;
        return area;
    }

    double getCircum(){
        double circum = 2 * radius * Math.PI;
        return circum;
    }
}

public class moso_practice {
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        double r = sc.nextDouble();
//
//        Circle c1 = new Circle(r);
//        System.out.println(c1.getCircum());
//        System.out.println(c1.getArea());

//        int n = 123;
//        for(int i=7;i>=0;i--){
//            System.out.print(n>>i&1);
//        }
        System.out.println(pow(2, 4));

    }

    static int pow(int a, int b){
        if(b==0)
            return 1;
        else
            return a*pow(a, b-1);
    }
}
