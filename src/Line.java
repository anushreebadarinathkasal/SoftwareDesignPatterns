// Student Name : Anushree Badarinath Kasal
// Student ID : 1001624311


//Expert pattern to create line when line button is clicked in GUI.
//Inherits Shape class
import java.awt.Graphics;


public class Line extends Shape {
  
    public Line(int x, int y) {
    	super(x,y);
    }

    @Override
    public void draw(Graphics g) {
    	
        g.drawLine(this.x, this.y,20,20);
        System.out.println("draw function called");
        System.out.println("x value"+this.x);
        System.out.println("y value"+this.y);
      
    }
}