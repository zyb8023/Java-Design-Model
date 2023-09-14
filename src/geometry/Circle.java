package geometry;

public class Circle extends Shape{
    // 中心点
    private Point center;
    // 半径
    private double r;
    public Circle(Point center, double r) {
        this.center = center;
        this.r = r;
    }

    @Override
    public void draw () throws RuntimeException  {
        System.out.println("draw circle at" + center.toString() + "with r: " + r + "using color: " + this.getColor());
    }

    // 面积
    public double area() {
        return Math.PI  * r * r;
    }

}
