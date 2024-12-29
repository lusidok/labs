
public class Main {
    public static void main(String[] args) {
        DrawingAPI rasterAPI = new RasterDrawingAPI();

        Shape circle = new Circle(50, 50, 8, rasterAPI);
        Shape rectangle = new Rectangle(70, 80, 12, 20, rasterAPI);

        circle.draw();
        rectangle.draw();
    }
}
