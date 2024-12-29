class RasterDrawingAPI implements DrawingAPI {
    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("Raster API: Drawing circle at (" + x + ", " + y + ") with radius " + radius);
    }

    @Override
    public void drawRectangle(int x, int y, int width, int height) {
        System.out.println("Raster API: Drawing rectangle at (" + x + ", " + y + ") with width " + width + " and height " + height);
    }
}
