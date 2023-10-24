package moso_practice;

public class Rect<T extends Number> {
    T width;
    T height;

    public Rect(T w, T h){
        width = w;
        height = h;
    }

    double getArea(){
        double area = (Double)width * (Double) height;
        return area;
    }

    double getCircum(){
        double circum = (Double)width * (Double)height;
        return circum;
    }
}
