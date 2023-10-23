package moso_midterm_2021;

abstract class Color {
    int myColor;

    public Color() {
        this.myColor = 0;
    }

    public Color(int color) {
        this.myColor = color;
    }

    abstract void setColor(int color);

    abstract String getColor();
}

class RainbowColor extends Color {
    String[] colors = {"red", "orange", "yellow", "green", "blue", "indigo", "purple"};

    public RainbowColor() {
        this.myColor = 0;
    }

    public RainbowColor(int color) {
        if (color < 0) this.myColor = 0;
        else if (color > 6) this.myColor = 6;
        else this.myColor = color;
    }

    void setColor(int color) {
        if (color < 0) this.myColor = 0;
        else if (color > 6) this.myColor = 6;
        else this.myColor = color;
    }

    String getColor() {
        return colors[myColor];
    }

    String nextColor() {
        if (myColor == 6) return "no color";
        else return colors[this.myColor + 1];
    }
}

class CarColor extends Color {
    String[] colors = {"black", "white"};

    public CarColor() {
        this.myColor = 0;
    }

    public CarColor(int color) {
        if (color < 0) this.myColor = 0;
        else if (color > 1) this.myColor = 1;
        else this.myColor = color;
    }

    void setColor(int color) {
        if (color < 0) this.myColor = 0;
        else if (color > 1) this.myColor = 1;
        this.myColor = color;
    }

    String getColor() {
        return colors[this.myColor];
    }

    String otherColor(){
        return colors[1-this.myColor];
    }
}

public class Quiz2 {
    public static void main(String[] args) {
        Color[] colors = {
                new RainbowColor(),
                new RainbowColor(2),
                new RainbowColor(4),
                new RainbowColor(),
                new CarColor(),
                new CarColor(1),
                new CarColor(-2),
                new CarColor()
        };

        for (Color tempColor : colors) {
            String c = tempColor.getColor();
            System.out.println("my color is " + c);
        }

        RainbowColor c1 = new RainbowColor(-1);
        CarColor c2 = new CarColor(3);
        System.out.println("the next color of c1 is " + c1.nextColor());
        System.out.println("the other color of c2 is " + c2.otherColor());
    }
}
