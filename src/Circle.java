// Student Name : Anushree Badarinath Kasal
// Student ID : 1001624311

//Expert pattern to create circle when circle button is clicked in GUI.
//Inherits Shape class
import java.awt.Graphics;


public class Circle extends Shape {


    public Circle(int x, int y) {
    	super(x,y);
    }

    @Override
    public void draw(Graphics g) {
        g.drawOval(this.x,this.y, 40, 40);
    }
    
    
}