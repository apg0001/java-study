package moso_hw_02;

class Arrays{
    static int[] A = {3, 2, 5, 7, 8, 9, 10, 2, 7, 8};
    static int[] B = {4, 3, 7, 3, 2, 6, 1, 0, 1, -2};
    static int[] C = new int[A.length];
}
class Multiply extends Thread{
    public String name;
    public int index;
    public Multiply(String s, int i){
        this.name = s;
        this.index = i;
        System.out.println("Creating " + this.name);
    }

    public void run(){
        System.out.println("Starting " + this.name);
        Arrays.C[index] = Arrays.A[index] * Arrays.B[index];
        System.out.println(this.name + " : C[" + index + "] = " + Arrays.C[index]);
    }

}

public class _04 {
    public static void main(String[] args) {
        Thread[] threads = {
                new Multiply("Thread0", 0),
                new Multiply("Thread1", 1),
                new Multiply("Thread2", 2),
                new Multiply("Thread3", 3),
                new Multiply("Thread4", 4),
                new Multiply("Thread5", 5),
                new Multiply("Thread6", 6),
                new Multiply("Thread7", 7),
                new Multiply("Thread8", 8),
                new Multiply("Thread9", 9)
        };
        for(Thread t : threads)
            t.start();
    }
}
