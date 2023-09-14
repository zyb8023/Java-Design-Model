package geometry;

public class Line {
    // 线的起始点
    private Point start;
    // 线的结束点
    private Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public double lineLength () {
        return  start.distance(end);
    }

}
