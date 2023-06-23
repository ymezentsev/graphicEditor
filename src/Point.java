public class Point extends Shape{

    public Point(double anchorPointX, double anchorPointY, String fillColor) {
        super(anchorPointX, anchorPointY, fillColor);
    }

     @Override
    void getFigureName() {
        System.out.println("It's a point");
    }
}
