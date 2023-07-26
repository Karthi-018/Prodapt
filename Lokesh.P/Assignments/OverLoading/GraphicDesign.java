public class GraphicDesign {
    public static void main(String[] args)
    {
        DrawingGraphics draw = new DrawingGraphics();
        System.out.println(draw.diagram(100,100));
        System.out.println(draw.diagram(250,200,6));

    }
}
class DrawingGraphics
{
    public int diagram(int label1, int label2)
    {
        System.out.println("Drawing a line");
        return label1;
    }
    public int diagram(int label1, int label2, int width)
    {
        System.out.println("Drawing a rectangle");

        return width;
    }
}
