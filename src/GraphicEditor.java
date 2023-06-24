public class GraphicEditor {
    public static void main(String[] args) {

        Shape[] shapes = {new Point(0.0, 0.0, "red"),
                new Line(1.0, 1.0, "green"),
                new Circle(2.0, 2.0, "orange"),
                 new Quad(3.0, 3.0, "black"),
                new Triangle(4.0, 4.0, "blue")};


        ShapeWorker shapeWorker;
        for (Shape shape : shapes) {
            shapeWorker = new ShapeWorker(shape);
            shapeWorker.getShapeName();
        }
    }
}
