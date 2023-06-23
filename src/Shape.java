public abstract class Shape {
    abstract void getFigureName();
    private double anchorPointX;
    private double anchorPointY;
     private String fillColor;

    public Shape(double anchorPointX, double anchorPointY, String fillColor) {
        this.anchorPointX = anchorPointX;
        this.anchorPointY = anchorPointY;
        this.fillColor = fillColor;
    }

    public double getAnchorPointX() {
        return anchorPointX;
    }

    public void setAnchorPointX(double anchorPointX) {
        this.anchorPointX = anchorPointX;
    }

    public double getAnchorPointY() {
        return anchorPointY;
    }

    public void setAnchorPointY(double anchorPointY) {
        this.anchorPointY = anchorPointY;
    }

    public String getFillColor() {
        return fillColor;
    }

    public void setFillColor(String fillColor) {
        this.fillColor = fillColor;
    }
}
