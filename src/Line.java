public class Line extends Shape{
    private double secondPointX;
    private double secondPointY;

    public Line(double anchorPointX, double anchorPointY, String fillColor) {
         super(anchorPointX, anchorPointY, fillColor);
    }

    public double getSecondPointX() {
        return secondPointX;
    }

    public void setSecondPointX(double secondPointX) {
        this.secondPointX = secondPointX;
    }

    public double getSecondPointY() {
        return secondPointY;
    }

    public void setSecondPointY(double secondPointY) {
        this.secondPointY = secondPointY;
    }

    @Override
    void getFigureName() {
        System.out.println("It's a line");
    }
}
