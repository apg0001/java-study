package moso_hw_02;
import java.lang.Runnable;

class Array{
    static int[] a={3, 2, 5, 7, 8, 9, 10, 2, 7, 8};
    static int[] b={4, 3, 7, 3, 2, 6, 1, 0, 1, -2};
    static int[] c = new int[a.length];
}

class Mul extends Thread /*implements Runnable*/{
    String name;
    int index;

    Mul(String n, int i){
        name = n;
        index = i;
        System.out.println("Create " + name);
    }

    public void run() {
        System.out.println("Start " + name);
        Array.c[index] = Array.a[index] * Array.b[index];
        System.out.println(index + " : " + Array.c[index]);
        System.out.println("Stop " + name);
    }
}

public class Quiz4 {
    public static void main(String[] args) {
        Mul[] threads = {
                new Mul("Thread0", 0),
                new Mul("Thread1", 1),
                new Mul("Thread2", 2),
                new Mul("Thread3", 3),
                new Mul("Thread4", 4),
                new Mul("Thread5", 5),
                new Mul("Thread6", 6),
                new Mul("Thread7", 7),
                new Mul("Thread8", 8),
                new Mul("Thread9", 9)
        };
        for(Mul t : threads){
            t.start();
        }
    }
}
