class Shapes
{
	public void drawshape(int x,int y,int radius)
	{
	System.out.println("draw a circle at ( " + x + " ,"+ y+ " ) with the  " +radius);
	}
	public void drawshape(int x,int y,int width,int height)
	{
	System.out.println("draw a rectangle at ( " +x + " ,"+ y+ " ) with the width " +width+ " and height " +height);
	}

}
public class ApplicationShapes{

	public static void main(String args[]){
	Shapes S= new Shapes();
	S.drawshape(10,15,50);
	S.drawshape(20,30,10,50);
}
}