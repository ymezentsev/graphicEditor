import javax.xml.transform.Source;

public class GraphicEditor {
    public static void main(String[] args) {
        Shape[] shapes = {new Point(0.0, 0.0, "red"),
                new Line(1.0, 1.0, "green"),
                new Circle(2.0, 2.0, "orange"),
                 new Quad(3.0, 3.0, "black"),
                new Triangle(4.0, 4.0, "blue")};

        for (Shape shape : shapes) {
            shape.getFigureName();
            System.out.printf("It's color - %s and anchor point coordinate: x = %4.2f, y =%4.2f%n",
                    shape.getFillColor(), shape.getAnchorPointX(), shape.getAnchorPointY());

            if(shape instanceof Borderable){
                System.out.printf("It has border, it's color - %s, width = %4.2f%n",
               ((Borderable) shape).getBorderColor(), ((Borderable) shape).getBorderWidth());
            }

            System.out.println();
        }
    }
}
