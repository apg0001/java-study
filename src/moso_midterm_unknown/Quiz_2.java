package moso_midterm_unknown;

class Rectangle<T extends Number>{
    private T width;
    private T height;

    Rectangle(T w, T h){
        width = w;
        height = h;
    }

    public double getArea(){
        double area = width.doubleValue() * height.doubleValue();
        return area;
    }
}

public class Quiz_2 {
    public static void main(String[] args){
        Rectangle<Integer> rect1 = new Rectangle<>(10, 20);
        Rectangle<Double> rect2 = new Rectangle<>(5.0, 4.0);

        System.out.println(rect1.getArea());
        System.out.println(rect2.getArea());
    }
}
