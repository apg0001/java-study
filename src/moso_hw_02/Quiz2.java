package moso_hw_02;

class Box_2<T extends Number> {
    T[] data;

    Box_2(T[] arr) {
        data = arr;
    }

    Double getSum() {
        Double sum = 0.0;
        for (T x : data) {
            sum += x.doubleValue();
        }
        return sum;
    }

    Double getAverage() {
        Double average = getSum() / data.length;
        return average;
    }
}

public class Quiz2 {
    public static void main(String[] args) {
        Integer[] arrInt = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        Double[] arrDouble = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 11.0, 12.0, 13.0, 14.0, 15.0, 16.0, 17.0, 18.0, 19.0, 20.0};

        Box_2<Integer> boxInt = new Box_2<Integer>(arrInt);
        Box_2<Double> boxDouble = new Box_2<Double>(arrDouble);

        System.out.println(boxInt.getSum());
        System.out.println(boxInt.getAverage());
        System.out.println(boxDouble.getSum());
        System.out.println(boxDouble.getAverage());
    }
}
