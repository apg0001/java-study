package moso_hw_02;

    class Box<T extends Number>{
        private T[] data;
        public Box(T[] data) {
            this.data = data;
        }
        public T sum(){
            T result = (T)Double.valueOf(0.0);
            for(T d : data){
                result = (T)Double.valueOf(d.doubleValue() + result.doubleValue());
            }
            return result;
        }

        public double average(){
            double result = this.sum().doubleValue() / this.data.length;
            return result;
        }
    }
public class _02 {
    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        Double[] doubles = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 11.0, 12.0, 13.0, 14.0, 15.0, 16.0, 17.0, 18.0, 19.0, 20.0};

        Box<Integer> intBox = new Box<Integer>(integers);
        Box<Double> doubleBox = new Box<Double>(doubles);

        System.out.println("Integers");
        System.out.println("합계 : " + intBox.sum() + ", 평균 : " + intBox.average());
        System.out.println("Doubles");
        System.out.println("합계 : " + doubleBox.sum() + ", 평균 : " + doubleBox.average());
    }
}
