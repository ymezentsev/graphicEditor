public class Triangle extends Shape implements Borderable{
    private double borderWidth;
    private String borderColor;
    private double secondPointX;
    private double secondPointY;
    private double thirdPointX;
    private double thirdPointY;
    public Triangle(double anchorPointX, double anchorPointY, String fillColor) {
        super(anchorPointX, anchorPointY, fillColor);
        this.borderWidth = 1.0;
        this.borderColor = "black";
    }

    public Triangle(double anchorPointX, double anchorPointY, String fillColor, double borderWidth, String borderColor) {
        super(anchorPointX, anchorPointY, fillColor);
        this.borderWidth = borderWidth;
        this.borderColor = borderColor;
    }

    @Override
    void getFigureName() {
        System.out.println("It's a triangle");
    }

    @Override
    public double getBorderWidth() {
        return this.borderWidth;
    }

    @Override
    public String getBorderColor() {
        return this.borderColor;
    }

    public void setBorderWidth(double borderWidth) {
        this.borderWidth = borderWidth;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
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

    public double getThirdPointX() {
        return thirdPointX;
    }

    public void setThirdPointX(double thirdPointX) {
        this.thirdPointX = thirdPointX;
    }

    public double getThirdPointY() {
        return thirdPointY;
    }

    public void setThirdPointY(double thirdPointY) {
        this.thirdPointY = thirdPointY;
    }
}
