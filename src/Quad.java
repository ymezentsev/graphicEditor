public class Quad extends Shape implements Borderable{
    private double borderWidth;
    private String borderColor;
    private double sizeLength;

    public Quad(double anchorPointX, double anchorPointY, String fillColor) {
         super(anchorPointX, anchorPointY, fillColor);
        this.borderWidth = 1.0;
        this.borderColor = "black";
    }

    public Quad(double anchorPointX, double anchorPointY, String fillColor, double borderWidth, String borderColor) {
        super(anchorPointX, anchorPointY, fillColor);
        this.borderWidth = borderWidth;
        this.borderColor = borderColor;
    }

    @Override
    void getFigureName() {
        System.out.println("It's a quad");
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

    public double getSizeLength() {
        return sizeLength;
    }

    public void setSizeLength(double sizeLength) {
        this.sizeLength = sizeLength;
    }
}
