public class ShapeWorker {
    private Shape shape;

    public ShapeWorker(Shape shape) {
        this.shape = shape;
    }

    public void getShapeName(){
        shape.getFigureName();
    }
}
