package geometry;

public class Point extends Shape {
    private int x;
    private int y;


    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    /**
     * @desc 距离点的坐标
     * @param p 点坐标
     * @return
     */
    public double distance(Point p) {
        return  Math.sqrt(Math.pow(x - p.getX(), 2) + Math.pow(y - p.getY(), 2));
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

}
