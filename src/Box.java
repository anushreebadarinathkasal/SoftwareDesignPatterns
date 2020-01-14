// Student Name : Anushree Badarinath Kasal
// Student ID : 1001624311

//Expert pattern to create box when box button is clicked in GUI.
//Inherits Shape class
import java.awt.Graphics;


public class Box extends Shape {
  
    public Box(int x, int y) {
    	super(x,y);
    }


	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.drawRect(this.x, this.y, 40, 40);
		
	}
}